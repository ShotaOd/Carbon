package org.dabuntu.web.auth;

import org.dabuntu.web.exception.UserIdentityNotFoundException;

/**
 * @author ubuntu 2016/11/03.
 */
public interface AuthIdentifier<IDENTITY extends AuthIdentity> {
	IDENTITY find(String username) throws UserIdentityNotFoundException;
}
