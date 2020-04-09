package com.babor.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Camera implements PhotoSnapper, ICamera {

    @Override
    public void snap() {
        System.out.println("SNAP");
    }
}
