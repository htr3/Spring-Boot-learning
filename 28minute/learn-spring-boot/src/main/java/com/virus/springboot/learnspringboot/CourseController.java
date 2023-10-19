package com.virus.springboot.learnspringboot;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virus.springboot.learnspringboot.CurrencyServiceConfiguration;

@RestController
public class CourseController {

	@Autowired
	private CurrencyServiceConfiguration configuration; 
	
	
//	@RequestMapping("/actuator")
//	public CurrencyServiceConfiguration retrieveAllCourse() {
//		return configuration;
//	}
	
}
