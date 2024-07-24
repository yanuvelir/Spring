package com.yan.spring.springApp_house;

import com.yan.spring.springApp_house.entity.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private House myHouse;

    @Autowired
    public MyController(House myHouse) {
        this.myHouse = myHouse;
    }

    @GetMapping("/house")
    public String getHouseWindowGlass(){
        //return myHouse.getWindow().getGlass().getGlassName();
        return "Some text";
    }
}
