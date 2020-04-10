package com.babor.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

    @Pointcut("within(@org.springframework.stereotype.Component com.babor.spring..*)")
    public void withinPointCut() {
    }

    @Before("withinPointCut()")
    public void withinBefore() {
        System.out.println("********** BEFORE ADVICE ************");
    }
}
