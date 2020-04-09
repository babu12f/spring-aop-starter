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

        Camera camera = (Camera) context.getBean("camera");

        try {
            camera.snap();
        } catch (Exception e) {
            System.out.println("In App : " + e.getMessage());
        }

        context.close();
    }
}
