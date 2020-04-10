package com.babor.spring.accessories;


import org.springframework.stereotype.Component;

@Component
@Deprecated
public class Lens {
    public void zoom(int factor) {
        System.out.println("Zooming lens: " + factor);
    }

}