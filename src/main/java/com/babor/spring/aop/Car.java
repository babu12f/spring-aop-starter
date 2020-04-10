package com.babor.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Car {
    public void start() {
        System.out.println("Car is Start running");
    }

    public void start(int speed, double accelaration) {
        System.out.printf("Cart Start Running with speed %d and Acclaration %.2f \n", speed, accelaration);
    }
}
