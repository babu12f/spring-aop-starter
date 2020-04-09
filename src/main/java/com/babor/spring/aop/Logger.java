package com.babor.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

    @Pointcut("execution(void com.babor.spring.aop.Camera.snap())")
    public void onCameraSnap() {
    }

    @Before("onCameraSnap()")
    public void aboutToTakePhoto() {
        System.out.println("About to take photo ....");
    }

    @Before("onCameraSnap()")
    public void anotherToTakePhoto() {
        System.out.println("Before take phone ====================== ");
    }
}
