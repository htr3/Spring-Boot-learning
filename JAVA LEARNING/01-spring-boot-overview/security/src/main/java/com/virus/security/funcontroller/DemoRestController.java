package com.virus.security.funcontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    @Value("{couch.name}")
    private String couchName;

    @Value("couch.username")
    private String teamName;

    @GetMapping("/api")
    public String demo() {
        return "team name " + couchName + "team name  " + teamName;
    }

    @GetMapping("/workout")
    public String test() {
        return "Virus is here";
    }

}
