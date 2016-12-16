package org.carbon.web.core.response.template;

import org.carbon.web.context.ApplicationPool;
import org.carbon.web.core.response.HtmlResponse;
import org.carbon.component.annotation.Component;
import org.carbon.component.annotation.Inject;
import org.carbon.web.context.RequestContainer;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.webapp.WebAppContext;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ubuntu 2016/10/14.
 */
@Component
public class TemplateEngineWrapper {

	@Inject
	private TemplateEngine templateEngine;

	public void run(HtmlResponse source, HttpServletResponse response) throws IOException{
		ContextHandler.Context context = WebAppContext.getCurrentContext();
		RequestContainer requestPool = ApplicationPool.instance.getRequestPool();
		HttpServletRequest request = requestPool.getByType(HttpServletRequest.class);

		WebContext webContext = new WebContext(request, response, context.getContext("/"));
		webContext.setVariables(source.getData());
		templateEngine.process(source.getHtmlPath(), webContext, response.getWriter());
	}
}
