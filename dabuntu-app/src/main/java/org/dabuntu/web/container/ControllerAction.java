package org.dabuntu.web.container;

import java.lang.reflect.Method;

/**
 * @author ubuntu 2016/10/11.
 */
public class ControllerAction {
	private Class controller;
	private Method action;

	public ControllerAction(Class controller, Method action) {
		this.controller = controller;
		this.action = action;
	}

	public Class getController() {
		return controller;
	}

	public Method getAction() {
		return action;
	}
}
