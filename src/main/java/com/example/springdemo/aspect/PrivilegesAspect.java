package com.example.springdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component //must
public class PrivilegesAspect {

    @Pointcut(value = "@annotation(requiresPrivileges)")
    public void privilegePointcut(RequiresPrivileges requiresPrivileges) {
    }

    //execute before method annotated by @RequiresPrivileges
    @Before(value = "@annotation(requiresPrivileges)")
    public void before(JoinPoint joinPoint, RequiresPrivileges requiresPrivileges) {
        System.out.println("====before pointcut=====");
        //check privileges
    }
}
