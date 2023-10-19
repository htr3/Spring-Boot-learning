package com.virus.springboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    // create a mapping for /virus
    @GetMapping("/hello")
    public String helloVirus(Model theModel) {
        theModel.addAttribute("theDate", new java.util.Date());
        return "Hellovirus";
    }

}
