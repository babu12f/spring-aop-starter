package com.babor.spring.aop;

import com.babor.spring.accessories.Lens;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        ICamera camera = (ICamera) context.getBean("camera");

        System.out.println("We Get an object of : " + camera.getClass());
        System.out.println("camera is an instance of ICamera :" + (camera instanceof ICamera));

        try {
            camera.snap();
        } catch (Exception e) {
            System.out.println("In App : " + e.getMessage());
        }

        context.close();
    }
}
