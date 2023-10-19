package com.virus.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age) {}; 
record Address (String firstLine, String city) {}; 
@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Virus"; 
	}
	
	@Bean
	public int age() {
		return 24; 
	}
	
	@Bean
	public Person virus() {
		var virus1 = new Person("virus", 24); 
		return virus1; 
	}
	
	@Bean
	public Person virus2MethodCall() {
		var virus1 = new Person(name(), age()); 
		return virus1; 
	}
	
	@Bean (name = "address2")
	public Address address() {
		var address1 = new Address("green divine, amanora park", "Pune"); 
		return address1; 
	}
}
