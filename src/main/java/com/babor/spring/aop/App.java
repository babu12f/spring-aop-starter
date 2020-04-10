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
        Lens lens = (Lens) context.getBean("lens");
        Car car = (Car) context.getBean("car");

        camera.snap();
        camera.snap(255);
        camera.snap("bangladesh");
        camera.snapNighttime();
        camera.snapCar(car);

        lens.zoom(333);

        context.close();
    }
}
