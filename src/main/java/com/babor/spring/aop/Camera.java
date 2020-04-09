package com.babor.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Camera {
    public void snap() throws Exception {
        System.out.println("SNAP");

        throw new Exception("New Exception throw bySelf");
    }
}
