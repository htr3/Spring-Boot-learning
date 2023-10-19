package com.virus.springcoredemo.rest;

import com.virus.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class NarutoController {
    private Coach myCoach;
    private Coach anotherCoach;



    @Autowired
    public  NarutoController(
        @Qualifier("cricketCoach") Coach theCoach,
                @Qualifier("cricketCoach") Coach theAnotherCoach) {
        System.out.println("In constructor " + getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }




    @GetMapping("/detail")
    public String getDailyDetail(){
        return myCoach.getDailyDetail();
    }



    @GetMapping("/check")
    public String check() {
        return "Comparing beans: myCoach == anotherCoach, ";
    }

}
