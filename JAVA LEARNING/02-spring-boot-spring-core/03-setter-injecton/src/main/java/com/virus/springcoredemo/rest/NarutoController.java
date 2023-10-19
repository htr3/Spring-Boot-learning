package com.virus.springcoredemo.rest;

import com.virus.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NarutoController {
    private Coach myCoach;
    @Autowired
    public void virusstuff(Coach theCoach) {
        this.myCoach = theCoach;

    }


    @GetMapping("/detail")
    public String getDailyDetail(){
        return myCoach.getDailyDetail();
    }

}
