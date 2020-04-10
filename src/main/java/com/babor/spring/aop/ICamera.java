package com.babor.spring.aop;

public interface ICamera {
    void snap();

    void snap(int exposure);

    void snap(double exposure);

    String snap(String name);

    void snapNighttime();

    void snapCar(Car car);

    void snap(int exposure, double aperture);
}
