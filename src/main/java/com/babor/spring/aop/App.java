package com.babor.spring.aop;

import com.babor.spring.accessories.Lens;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        ICamera camera = (ICamera) context.getBean("camera");
        Car car = (Car) context.getBean("car");

        camera.snap();
        camera.snap(500);
        camera.snap(1.8);
        camera.snap(500, 1.8);
        camera.snapNighttime();
        camera.snapCar(car);

        car.start();
        car.start(144, 3.99);

        context.close();
    }
}
