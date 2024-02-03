package org.ahmtkutlu;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyWebServiceConfiguration {
    String path();
    String protocol() default "http";
    int port() default 8080;
    String[]  users();
}