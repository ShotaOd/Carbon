package org.carbon.web.auth;

/**
 * @author Shota Oda 2016/10/28.
 */
public class Authentication {

	private String authKey;

	public Authentication(String authKey) {
		this.authKey = authKey;
	}

	public static Authentication NotRequired = new Authentication(null);

	public String getAuthKey() {
		return authKey;
	}

	public boolean requiredAuth() {
		return authKey != null;
	}
}
