package com.babor.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

//    @Pointcut("within(com.babor.spring.aop.Camera)")
    @Pointcut("within(com.babor.spring.aop.*)")
    public void onCameraSnap() {
    }

    @Before("onCameraSnap()")
    public void aboutToTakePhoto() {
        System.out.println("Before Advice : ");
    }
}
