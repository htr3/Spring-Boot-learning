package com.virus.springcoredemo.rest;

import com.virus.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NarutoController {
    private Coach myCoach;

    @Autowired     // tells Spring to inject a dependency ,
            // if you have only one constructor then @Autowire is option.
    NarutoController(Coach myCoach) {
        this.myCoach = myCoach;
    }


    @GetMapping("/detail")
    public String getDailyDetail(){
        return myCoach.getDailyDetail();
    }

}
