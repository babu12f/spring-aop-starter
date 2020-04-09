package com.babor.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

    @Pointcut("execution(* com.babor.spring.aop.Camera.snap(..))")
    public void onCameraSnap() {
    }

    @Before("onCameraSnap()")
    public void aboutToTakePhoto() {
        System.out.println("About to take photo ....");
    }

    @After("onCameraSnap()")
    public void afterTakePhoto() {
        System.out.println("Take Photo Successfully :)");
    }

    @AfterReturning("onCameraSnap()")
    public void afterReturnSuccessful() {
        System.out.println("The method perform when calling method return successfully without any exception ");
    }

    @AfterThrowing("onCameraSnap()")
    public void afterThrowingException() {
        System.out.println("This Action preform only when calling method throw an exception !!!");
    }

    @Around("onCameraSnap()")
    public void aroundAdvice(ProceedingJoinPoint p) {
        System.out.println("(Before) around advice");

        try {
            p.proceed();
        } catch (Throwable e) {
            System.out.println("In Around : " + e.getMessage());
        }

        System.out.println("(After) around advice");
    }
}
