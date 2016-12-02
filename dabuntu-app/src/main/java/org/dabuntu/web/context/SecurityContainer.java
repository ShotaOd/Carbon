package org.dabuntu.web.context;

import org.dabuntu.web.auth.AuthIdentity;
import org.dabuntu.web.auth.AuthStrategy;

import java.util.List;

/**
 * @author ubuntu 2016/10/29.
 */
public class SecurityContainer {

	private List<AuthStrategy<AuthIdentity>> strategies;

	public SecurityContainer() {
	}

	public SecurityContainer(List<AuthStrategy<AuthIdentity>> strategies) {
		this.strategies = strategies;
	}

	public boolean existSecurity() {
		return strategies != null && !strategies.isEmpty();
	}

	public List<AuthStrategy<AuthIdentity>> getStrategies() {
		return strategies;
	}
}
