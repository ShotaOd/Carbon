package org.dabuntu.web.server.jetty._escape;

import org.dabuntu.component.annotation.Inject;
import org.dabuntu.web.core.DabuntCore;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.HandlerWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ubuntu 2016/10/04.
 */
@Deprecated
public class DispatchHandler extends HandlerWrapper {

	private static Logger logger = LoggerFactory.getLogger(DispatchHandler.class);

	@Inject
	private DabuntCore core;

	@Override
	public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		core.execute(request, response);

		super.handle(target, baseRequest, request, response);
	}
}
