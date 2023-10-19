package com.virus.springboot.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloVirusController {


    // need a controller method to show initial HTML form

    @RequestMapping("/showForm")
    public String showForm() {
        return "hellovirus-from";
    }

    // need a controller method to process the HTML form
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloVirus";
    }


    // NEED A CONTRLOOER METHOD TO REA FOMR DATA AND
    // Add data to the model


//    @RequestMapping("/processFormVersionTwo")
//    public String letsShoutDude(HttpServletRequest request, Model model) {
//
//        // read request parameter from the html form
//        String theName = request.getParameter("characterName");
//
//        // convert the data to all caps
//        theName  = theName.toUpperCase();
//
//        // create the message
//        String result = "Yo!  " + theName;
//
//        // ddd message to teh model
//        model.addAttribute("message", result);
//
//
//
//
//        return "helloVirus";
//    }

    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("characterName") String theName, Model model) {

        // read request parameter from the html form
//        String theName = request.getParameter("characterName");

        // convert the data to all caps
        theName  = theName.toUpperCase();

        // create the message
        String result = "hey vishal is it   " + theName;

        // ddd message to teh model
        model.addAttribute("message", result);




        return "helloVirus";
    }
}
