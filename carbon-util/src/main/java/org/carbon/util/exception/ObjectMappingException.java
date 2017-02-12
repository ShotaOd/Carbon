package org.carbon.util.exception;

/**
 * @author Shota Oda 2016/10/12.
 */
public class ObjectMappingException extends RuntimeException {
    public ObjectMappingException() {}
    public ObjectMappingException(String message) {
        super(message);
    }
    public ObjectMappingException(String message, Throwable cause) {
        super(message, cause);
    }
}
