package com.virus.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    public String getDailyDetail(){
        return "Practice Vishal thakur it must";
    }

}
