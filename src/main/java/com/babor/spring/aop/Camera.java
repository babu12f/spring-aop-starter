package com.babor.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Camera implements PhotoSnapper, ICamera {

    @Override
    @Deprecated
    public void snap() {
        System.out.println("SNAP");
    }

    @Override
    public void snap(int exposure) {
        System.out.println("SNAP! Exposure:" + exposure);
    }

    @Override
    public void snap(double exposure) {
        System.out.println("SNAP! Exposure:" + exposure);
    }

    @Override
    public String snap(String name) {
        System.out.println("SNAP! Name:" + name);

        return name;
    }

    @Override
    public void snapNighttime() {
        System.out.println("SNAP! Night mode.");
    }

    @Override
    public void snapCar(Car car) {
        System.out.println("SNAP! With Car.");
    }

    @Override
    public void snap(int exposure, double aperture) {
        System.out.printf("SNAP with exposure %d aperture %.2f\n", exposure, aperture);

    }
}
