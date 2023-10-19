package com.virus.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{


    @Override
    public String getDailyDetail() {
        return "Football Coach ";
    }
}
