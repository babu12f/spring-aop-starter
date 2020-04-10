package com.babor.spring.aop;

import org.aspectj.lang.JoinPoint;
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

    @Before("withinPointCut(exposure, aperture)")
    public void withinBefore(int exposure, double aperture) {
        System.out.println("********** BEFORE ADVICE ************");

        System.out.println("Arg : exposure " + exposure);
        System.out.println("Arg : aperture " + aperture);
    }
}
