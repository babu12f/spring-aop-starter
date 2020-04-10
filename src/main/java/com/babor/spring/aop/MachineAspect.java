package com.babor.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MachineAspect {

    @DeclareParents(value = "com.babor.spring.aop.*", defaultImpl = com.babor.spring.aop.Machine.class)
    private IMachine machine;

    @Around("within(com.babor.spring.aop.*)")
    public void runMachine(ProceedingJoinPoint jp) {

        System.out.println("Running ...");
        try {
            jp.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("... completed.");
    }
}
