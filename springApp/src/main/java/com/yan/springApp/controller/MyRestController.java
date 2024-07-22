package com.yan.springApp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @Value("${greeting.text}")
    private String greeting;

    @Value("${my.City}")
    private String location;

    @Value("${my.House}")
    private String house;

    @GetMapping("/")
    public String helloWorld(){
        return greeting;
    }

    @GetMapping("/location")
    public String location(){
        return location + "," + "<br>" + house + ".";
    }

}
