package com.babor.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        IBlender blender = (IBlender) context.getBean("blender");
        IFan fan = (IFan) context.getBean("fan");

        ((IMachine)blender).start();
        blender.blend();

        ((IMachine)fan).start();
        fan.activate(5);

        context.close();
    }
}
