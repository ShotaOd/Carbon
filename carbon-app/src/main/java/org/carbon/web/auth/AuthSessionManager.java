package org.carbon.web.auth;

import org.carbon.web.context.SessionContainer;

import java.util.Optional;

/**
 * @author ubuntu 2016/11/03.
 */
public interface AuthSessionManager<IDENTITY extends AuthIdentity> {
	Optional<IDENTITY> get(SessionContainer session);
	void set(AuthIdentity identity, SessionContainer session);
	void remove(SessionContainer session);
}
