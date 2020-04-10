package com.babor.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

//    @Pointcut("args()")
//    @Pointcut("args(int)")
//    @Pointcut("args(int, double)")
//    @Pointcut("args(int, *)")
//    @Pointcut("args(int, ..)")
//    @Pointcut("args(com.babor.spring.aop.Car)")
//    @Pointcut("args(.., double)")
    @Pointcut("args(.., Double)")
    public void withinPointCut() {
    }

    @Before("withinPointCut()")
    public void withinBefore() {
        System.out.println("********** BEFORE ADVICE ************");
    }
}
