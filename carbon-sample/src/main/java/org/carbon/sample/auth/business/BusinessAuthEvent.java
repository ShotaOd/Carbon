package org.carbon.sample.auth.business;

import org.carbon.component.annotation.Component;
import org.carbon.sample.auth.form.FormAuthEvent;
import org.carbon.web.util.ResponseUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ubuntu 2016/11/23.
 */
@Component
public class BusinessAuthEvent extends FormAuthEvent {
	@Override
	public void onFail(HttpServletRequest request, HttpServletResponse response) {
		ResponseUtil.redirect(response, "/business/login");
	}
}
