package org.carbon.persistent;

/**
 * @author Shota Oda 2016/11/12.
 */
public class PersistentConfigurer {
	private PersistentImplementation implementation;

	public PersistentConfigurer(PersistentImplementation implementation) {
		this.implementation = implementation;
	}
}
