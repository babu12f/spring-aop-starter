package com.babor.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

    @Pointcut("within(com.babor.spring.aop.*)")
    public void withinPointCut() {
    }

    @Pointcut("target(com.babor.spring.aop.Camera)")
    public void targetPointCut() {
    }

    @Pointcut("this(com.babor.spring.aop.ICamera)")
    public void thisPointCut() {
    }

    @Before("withinPointCut()")
    public void withinBefore() {
        System.out.println("********** :WITHIN: BEFORE ADVICE ************");
    }

    @Before("targetPointCut()")
    public void targetBefore() {
        System.out.println("********** :TARGET: BEFORE ADVICE ************");
    }

    @Before("thisPointCut()")
    public void thisBefore() {
        System.out.println("********** :THIS: BEFORE ADVICE ************");
    }
}
