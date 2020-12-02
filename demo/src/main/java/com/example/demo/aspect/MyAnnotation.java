package com.example.demo.aspect;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@Inherited
public @interface MyAnnotation {
    String type() default "ap";

}
