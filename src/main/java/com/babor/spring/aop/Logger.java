package com.babor.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

    @Pointcut("execution(* com.babor.spring.aop.Camera.*(..))")
    public void onCameraSnap() {
    }

    @Pointcut("execution(* *.*(..))")
    public void onCameraActivity() {
    }

    @Before("onCameraSnap()")
    public void aboutToTakePhoto() {
        System.out.println("About to take photo ....");
    }

    @Before("onCameraActivity()")
    public void cameraRelatedActivity() {
        System.out.println("Camera Related Activity !!!!!!!!!!!!!");
    }
}
