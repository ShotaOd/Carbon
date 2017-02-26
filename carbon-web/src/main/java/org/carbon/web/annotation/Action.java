package org.carbon.web.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.carbon.web.def.HttpMethod;

/**
 * @author Shota Oda 2016/10/05.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Action {
    String url();
    HttpMethod method();
}
