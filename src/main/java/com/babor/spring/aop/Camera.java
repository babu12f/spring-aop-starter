package com.babor.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Camera implements PhotoSnapper, ICamera {
    public Camera() {
        System.out.println("form camera constructor");
    }

    @Override
    public void snap() throws Exception {
        System.out.println("SNAP");

        throw new Exception("New Exception throw bySelf");
    }
}
