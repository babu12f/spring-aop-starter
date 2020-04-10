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

        camera.snap();

        lens.zoom(333);

        context.close();
    }
}
