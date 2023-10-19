package com.virus.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class KabbadiCoach implements Coach{

    public String getDailyDetail(){
        return "Kabbadi Coach";
    }

}
