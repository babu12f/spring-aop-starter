package com.babor.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

//    @Pointcut("bean(lens)")
    @Pointcut("bean(*e*)")
    public void withinPointCut() {
    }

    @Before("withinPointCut()")
    public void withinBefore() {
        System.out.println("********** BEFORE ADVICE ************");
    }
}
