package com.babor.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Camera camera = (Camera) context.getBean("camera");
        Car car = (Car) context.getBean("car");

        camera.snap();
        camera.snap(213);
        camera.snap("bangladesh");

        car.start();

        context.close();
    }
}
