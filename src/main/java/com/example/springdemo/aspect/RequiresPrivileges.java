package com.example.springdemo.aspect;

import java.lang.annotation.*;

@Target({ElementType.PARAMETER, ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequiresPrivileges {

    PrivilegeEnum[] value();

    Logical logical() default Logical.AND;
}
