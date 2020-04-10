package com.babor.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

    @Pointcut("target(com.babor.spring.aop.Camera)")
    public void withinPointCut() {
    }

    @Before("withinPointCut()")
    public void withinBefore(JoinPoint jp) {
        System.out.println("********** BEFORE ADVICE ************");

        for (Object arg : jp.getArgs()) {
            System.out.println("Args : " + arg);
        }
    }
}
