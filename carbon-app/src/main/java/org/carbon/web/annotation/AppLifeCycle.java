package org.carbon.web.annotation;

import org.carbon.web.lifecycle.LifeCycle;

/**
 * @author Shota Oda 2016/11/15.
 */
public @interface AppLifeCycle {
	LifeCycle value();
}
