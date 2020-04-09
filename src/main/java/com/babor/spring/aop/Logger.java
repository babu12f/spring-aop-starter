package com.babor.spring.aop;

/***
 * This Logger Class is an Aspect
 * */
public class Logger {

    /**
     * This method is an Advice
     * */
    public void aboutToTakePhoto() {
        System.out.println("About to take photo ....");
    }
}
