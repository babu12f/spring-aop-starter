package com.babor.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        ICamera camera = (ICamera) context.getBean("camera");

        camera.snap();

        context.close();
    }
}
