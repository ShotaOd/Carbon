package org.carbon.modular.conf;

import java.util.List;
import java.util.stream.Collectors;

import org.carbon.component.annotation.AfterInject;
import org.carbon.component.annotation.Assemble;
import org.carbon.component.annotation.Configuration;
import org.carbon.component.annotation.Inject;
import org.carbon.modular.annotation.Property;
import org.carbon.modular.env.EnvironmentMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Shota Oda 2017/03/06.
 */
@Configuration
public class PropertyConfiguration {
    private static Logger logger = LoggerFactory.getLogger(PropertyConfiguration.class);
    private boolean initialized = false;

    @Inject
    private EnvironmentMapper envMapper;

    @Assemble({Property.class})
    private List<Object> props;

    @AfterInject
    public void afterInject() {
        if (logger.isInfoEnabled()) {
            String classes = props.stream().map(prop -> "-" + prop.getClass().getName()).collect(Collectors.joining("\n"));
            logger.info("Resolve property classes below\n{}", classes);
        }
        props.forEach(prop -> {
            Property propertyAnnotation = prop.getClass().getDeclaredAnnotation(Property.class);
            String key = propertyAnnotation.key();
            envMapper.apply(key, prop);
        });
        initialized = true;
    }

    public boolean isReady() {
        return initialized;
    }
}
