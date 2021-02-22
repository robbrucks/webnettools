package io.github.johannesschaefer.webnettools.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface StringParam {
    String displayName();

    String description() default "";

    String param();

    int minLength() default 0;

    int maxLength() default Integer.MAX_VALUE;

    String group() default "Options";

    ParameterType paramType() default ParameterType.SPACE;
}