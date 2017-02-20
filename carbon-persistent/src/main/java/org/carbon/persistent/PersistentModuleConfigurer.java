package org.carbon.persistent;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import javax.persistence.Entity;
import javax.sql.DataSource;

import org.carbon.component.ComponentManager;
import org.carbon.component.exception.PackageScanException;
import org.carbon.modular.ModuleConfigurer;
import org.carbon.persistent.prop.DataSourceProperty;
import org.carbon.persistent.prop.PersistentImplementation;
import org.carbon.persistent.exception.PersistentSetupException;
import org.carbon.persistent.hibernate.AutoDDL;
import org.carbon.persistent.hibernate.EntitiesInfo;
import org.carbon.persistent.hibernate.HibernateConfigurer;
import org.carbon.persistent.jooq.JooqConfigurer;
import org.carbon.util.mapper.ConfigHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Shota Oda 2017/02/09.
 */
public class PersistentModuleConfigurer implements ModuleConfigurer {
    private Logger logger = LoggerFactory.getLogger(PersistentModuleConfigurer.class);

    private final String ImplKey = "persistent.implementation";
    private final String DataSourceKey = "persistent.dataSource";
    private final String AutoDDLKey = "persistent.option.autoddl";

    @Override
    public Map<Class, Object> registerObject(Class scanBase, ConfigHolder configHolder) {
        Map<Class, Object> dependency = new HashMap<>();
        if (getPersistentImplementation(configHolder) == PersistentImplementation.Hibernate) {
            ComponentManager componentManager = new ComponentManager();
            Set<Class<?>> entities;
            try {
                entities = componentManager.scan(scanBase, Collections.singleton(Entity.class));
            } catch (PackageScanException e) {
                throw new PersistentSetupException("Fail scan entities", e);
            }
            EntitiesInfo entitiesInfo = new EntitiesInfo(entities.stream().map(Class::getName).collect(Collectors.toList()));
            AutoDDL autoDDL = configHolder.findPrimitive(AutoDDLKey, String.class).map(AutoDDL::actionOf).orElse(AutoDDL.None);

            dependency.put(EntitiesInfo.class, entitiesInfo);
            dependency.put(AutoDDL.class, autoDDL);
        }

        Optional<DataSourceProperty> optionalProperty = configHolder.findOne(DataSourceKey, DataSourceProperty.class);
        if (optionalProperty.isPresent()) {
            logger.info("Detect Datasource property. Create and Inject Datasource");
            dependency.put(DataSource.class, optionalProperty.get().toDataSource());
        } else {
            logger.info("Cannot Detect Datasource property. Expect to be loaded custom Datasource.");
        }
        return dependency;
    }

    @Override
    public Set<Class> registerClass(Class scanBase, ConfigHolder configHolder) {
        PersistentImplementation persistentImplementation = getPersistentImplementation(configHolder);
        Set<Class> classes = new HashSet<>();
        switch (persistentImplementation) {
            case Hibernate:
                classes.add(HibernateConfigurer.class);
                break;
            case Jooq:
                classes.add(JooqConfigurer.class);
                break;
            case None:
            default:
        }

        return classes;
    }

    private PersistentImplementation getPersistentImplementation(ConfigHolder configHolder) {
        return configHolder
            .findPrimitive(ImplKey, String.class)
            .map(PersistentImplementation::implOf)
            .orElse(PersistentImplementation.None);
    }
}
