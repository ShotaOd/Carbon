package org.carbon.web.handler;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.carbon.component.annotation.Component;
import org.carbon.component.annotation.Inject;
import org.carbon.web.tl.error.HttpErrorTranslator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Shota Oda 2016/10/17.
 */
@Component
public class ErrorWrapperChain extends HandlerChain {

    private Logger logger = LoggerFactory.getLogger(ErrorWrapperChain.class);

    @Inject
    private HttpErrorTranslator translator;

    @Override
    protected void chain(HttpServletRequest request, HttpServletResponse response) {
        try {
            super.chain(request, response);
        } catch (Throwable throwable) {
            if (!translator.tryTranslate(throwable, response)) {
                logger.error("Error that can't be handled is Occurred", throwable);
                response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
                try {
                    response.getWriter().println("<h1>Error</h1>");
                } catch (IOException ignored) {
                }
            } else {
                logger.debug("Handled error({}, {}) but being translated ", throwable.getClass().getName(), throwable.getMessage());
                logger.error("", throwable);
            }
        }
    }
}
