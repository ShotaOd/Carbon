package org.carbon.authentication;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.carbon.web.context.session.SessionContext;

/**
 * @author Shota Oda 2016/11/03.
 */
public interface AuthEventListener<ID> {
    void onAuth(ID identity, SessionContext sessionContext);
    void onFail(HttpServletRequest request, HttpServletResponse response);
}
