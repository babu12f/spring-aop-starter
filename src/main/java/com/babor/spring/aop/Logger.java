package com.babor.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

    @Pointcut("args(exposure, aperture)")
    public void withinPointCut(int exposure, double aperture) {
    }

    @Pointcut("target(com.babor.spring.aop.Camera)")
    public void targetPointCut() {
    }

    @Before("targetPointCut() && withinPointCut(exposure, aperture)")
    public void withinBefore(int exposure, double aperture) {
        System.out.println("********** BEFORE ADVICE ************");

        System.out.println("Arg : exposure " + exposure);
        System.out.println("Arg : aperture " + aperture);
    }

//    @After("within(com.babor.spring.aop.*) && @annotation(Deprecated)")
//    @After("within(com.babor.spring.aop.*) && !@annotation(Deprecated)")
    @After("within(com.babor.spring.aop.*) || !@annotation(Deprecated)")
    public void oneAfterAdvice() {
        System.out.println(".................. AFTER ADVICE RUNNING .................");
    }
}
