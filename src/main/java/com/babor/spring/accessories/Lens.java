package com.babor.spring.accessories;

import org.springframework.stereotype.Component;

@Component
public class Lens {
    public void focus(int factor) {
        System.out.println("Focusing lens: " + factor);
    }
}
