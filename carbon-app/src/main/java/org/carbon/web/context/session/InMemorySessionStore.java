package org.carbon.web.context.session;

import org.carbon.web.context.InstanceContainer;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author ubuntu 2016/12/17.
 */
public class InMemorySessionStore implements SessionStore {
    private Map<String, InstanceContainer> store;

    public InMemorySessionStore() {
         store = new HashMap<>();
    }

    @Override
    public <T> T get(String key, Class<T> type) {
        return Optional.ofNullable(store.get(key))
            .map(ic -> ic.getInstanceByType(type))
            .orElse(null);
    }

    @Override
    public void put(String key, Object object) {
        InstanceContainer ic = store.computeIfAbsent(key, k -> new InstanceContainer());
        ic.set(object);
    }

    @Override
    public void remove(String key, Class type) {
        Optional.ofNullable(store.get(key))
            .ifPresent(ic -> ic.remove(type));
    }
}
