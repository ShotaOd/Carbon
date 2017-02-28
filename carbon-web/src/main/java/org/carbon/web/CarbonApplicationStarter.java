package org.carbon.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.carbon.component.ComponentManager;
import org.carbon.modular.ModuleConfigurer;
import org.carbon.util.format.ChapterAttr;
import org.carbon.util.mapper.ConfigHolder;
import org.carbon.web.conf.WebProperty;
import org.carbon.web.context.InstanceContainer;
import org.carbon.web.exception.ApplicationStartException;
import org.carbon.web.context.app.ApplicationContext;
import org.carbon.web.def.Logo;
import org.carbon.web.server.EmbedServer;
import org.carbon.web.server.jetty.JettyServerBridge;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Shota Oda 2016/10/06.
 */
public class CarbonApplicationStarter {

    // ===================================================================================
    //                                                                          Logger
    //                                                                          ==========
    private Logger logger = LoggerFactory.getLogger(CarbonApplicationStarter.class);

    // ===================================================================================
    //                                                                          Field
    //                                                                          ==========
    private String config = "config";
    private List<Class<? extends ModuleConfigurer>> moduleConfigurers = new ArrayList<>();

    public void setConfig(String config) {
        this.config = config;
    }

    @SafeVarargs
    public final void setModuleConfigurers(Class<? extends ModuleConfigurer>... moduleConfigurers) {
        this.moduleConfigurers = Arrays.asList(moduleConfigurers);
    }

    // ===================================================================================
    //                                                                          Member
    //                                                                          ==========
    private ComponentManager componentManager = new ComponentManager();

    // ===================================================================================
    //                                                                              Public
    //                                                                              ======
    public void start(Class scanBase) throws Exception {
        start(scanBase,
                () -> logger.info(ChapterAttr.get("Carbon Initialize Finished")),
                () -> logger.info(ChapterAttr.get("Carbon Start Running")));
    }

    public void start(Class scanBase, Runnable onPrepare, Runnable onStart) throws Exception {
        EmbedServer embedServer;
        // prepare
        try {
            embedServer = prepare(scanBase);
        } catch (Exception e) {
            throw new ApplicationStartException("Application StartUp Error", e);
        }

        onPrepare.run();

        // run
        try {
            embedServer.run(scanBase);
        } catch (Exception e) {
            throw new ApplicationStartException("Application Start running Error", e);
        }

        onStart.run();

        // await
        embedServer.await();
    }

    private EmbedServer prepare(Class scanBase) throws Exception {
        logger.info(new Logo().logo);
        logger.info(ChapterAttr.get("Carbon Initialize Started"));

        Map<Class, Object> dependency = new HashMap<>();

        ConfigHolder configHolder = new ConfigHolder(config + ".yml");
        dependency.put(ConfigHolder.class, configHolder);

        // resolve external module
        List<? extends ModuleConfigurer> moduleConfigurers = this.moduleConfigurers.stream()
                .map(registerClass -> componentManager.constructClass(registerClass))
                .collect(Collectors.toList());
        Map<Class, Object> moduleObjects = setupModuleObjects(moduleConfigurers, scanBase, configHolder);
        Set<Class> moduleClasses = setupModuleClasses(moduleConfigurers, scanBase, configHolder);

        dependency.putAll(moduleObjects);

        WebProperty webProperty = configHolder.findOne("web", WebProperty.class).get();
        dependency.put(WebProperty.class, webProperty);

        InstanceContainer appInstances = resolveDependency(scanBase, moduleClasses, dependency);

        ApplicationContext.init(appInstances);

        return appInstances.getByType(JettyServerBridge.class);
    }

    // ===================================================================================
    //                                                                             Private
    //                                                                             =======
    private Map<Class, Object> setupModuleObjects(List<? extends ModuleConfigurer> moduleConfigurers, Class scanBase, ConfigHolder configHolder) {
        return moduleConfigurers.stream()
                .flatMap(moduleConfigurer -> moduleConfigurer.registerObject(scanBase, configHolder).entrySet().stream())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    private Set<Class> setupModuleClasses(List<? extends ModuleConfigurer> moduleConfigurers, Class scanBase, ConfigHolder configHolder) {
        return moduleConfigurers.stream()
                .flatMap(moduleConfigurer -> moduleConfigurer.registerClass(scanBase, configHolder).stream())
                .collect(Collectors.toSet());
    }

    private InstanceContainer resolveDependency(Class scanBase, Set<Class> configurations, Map<Class, Object> dependency) throws Exception {
        // load component -> create component
        Set<Class<?>> frameworkManaged = componentManager.scanComponent(ConfigurationBase.class);
        Set<Class<?>> clientManaged = componentManager.scanComponent(scanBase);

        Set<Class> allManaged = new HashSet<>();
        allManaged.addAll(frameworkManaged);
        allManaged.addAll(clientManaged);
        allManaged.addAll(configurations);

        Map<Class, Object> instances = componentManager.generate(allManaged, dependency);
        return new InstanceContainer(instances);
    }
}