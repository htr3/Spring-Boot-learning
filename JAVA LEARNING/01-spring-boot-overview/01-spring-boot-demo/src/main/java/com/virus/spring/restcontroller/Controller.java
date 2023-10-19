package com.virus.spring.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/api")
    public String print() {
        return "This is virus";
    }
}
