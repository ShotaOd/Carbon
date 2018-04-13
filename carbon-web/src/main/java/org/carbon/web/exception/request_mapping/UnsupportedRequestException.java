package org.carbon.web.exception.request_mapping;

import org.carbon.web.exception.WrappedException;

/**
 * @author Shota.Oda 2018/03/03.
 */
public class UnsupportedRequestException extends RequestMappingException {
    public UnsupportedRequestException(String message) {
        super(message);
    }

    @Override
    protected WrappedException self() {
        return this;
    }
}
