package com.babor.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Camera {
    public void snap() {
        System.out.println("SNAP");
    }

    public void snap(int zoom) {
        System.out.println("snap !! with zoom : " + zoom);
    }

    public String snap(String name) {
        System.out.println("snap !! with Name : " + name);
        return name;
    }

    public void nightShoot() {
        System.out.println("snap !! with Night Shoot");
    }
}
