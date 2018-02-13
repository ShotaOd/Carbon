package org.carbon.component.exception;

/**
 * @author garden 2018/01/16.
 */
public class ImpossibleDetermineException extends Exception {
    public ImpossibleDetermineException(Class target) {
        super(String.format("%s is not ready", target));
    }
}
