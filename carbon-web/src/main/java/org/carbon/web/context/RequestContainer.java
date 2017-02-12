package org.carbon.web.context;

import org.carbon.component.annotation.Component;

import java.util.HashMap;

/**
 * @author Shota Oda 2016/10/14.
 */
@Component
public class RequestContainer {
    private RequestContainer() {}
    private static ThreadLocal<InstanceContainer> threadLocal = new ThreadLocal<InstanceContainer>() {
        @Override
        protected InstanceContainer initialValue() {
            return new InstanceContainer(new HashMap<>());
        }
    };

    public void setObject(Object object, Class typeAs) {
        threadLocal.get().set(object, typeAs);
    }

    public void setObject(Object object) {
        threadLocal.get().set(object);
    }

    public <T> T getByType(Class<T> type) {
        return threadLocal.get().getByType(type);
    }

    public void clear() {
        threadLocal.remove();
    }
}
