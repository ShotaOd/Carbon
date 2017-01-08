package org.carbon.web.core.response.processor;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.carbon.web.core.response.AbstractResponseProcessor;
import org.carbon.component.annotation.Component;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Shota Oda 2016/10/14.
 */
@Component
public class JsonProcessor extends AbstractResponseProcessor {

	private ObjectMapper mapper = new ObjectMapper();

	@Override
	public boolean process(HttpServletResponse response) {
		try {
			response.setContentType("application/json; charset=utf-8");
			mapper.writeValue(response.getWriter(), this.result);
			response.setStatus(HttpServletResponse.SC_OK);
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
}