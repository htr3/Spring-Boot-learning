package com.virus.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public String getDailyDetail(){
        return "Cricket Coach Practice Vishal thakur it must -:)";
    }

}