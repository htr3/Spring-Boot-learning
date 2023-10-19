package com.virus.demo.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/say")
public class DemoRestContrller {

    @GetMapping("/virus")
    public String sayVirus() {
        return "Hello Virus";
    }
}
