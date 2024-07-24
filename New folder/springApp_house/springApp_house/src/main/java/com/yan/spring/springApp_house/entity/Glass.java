package com.yan.spring.springApp_house.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Glass {

    @Value("Spring boot glass")
    private String glassName;

    public Glass() {
        System.out.println("My Glass");

        this.glassName  = glassName;
    }

    public String getGlassName() {
        return glassName;
    }

    public void setGlassName(String glassName) {
        this.glassName = glassName;
    }
}
