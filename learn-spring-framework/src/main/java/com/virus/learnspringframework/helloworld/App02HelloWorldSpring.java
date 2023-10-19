package com.virus.learnspringframework.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
	
	public static void main(String[] args) {
		
	//1. Launch a Spring Context 
		try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			//2. Configure the things that we want Spring to manage - @Configuration
			// HelloWorldConfiguration - @Configuration
			// name - @Bean
				
				
				System.out.println(context.getBean("name")); 
				
				System.out.println(context.getBean("age"));
				
				System.out.println(context.getBean("virus")); 
				
				System.out.println(context.getBean("virus2MethodCall")); 
				
				System.out.println(context.getBean("address2")); 
				
				System.out.println(context.getBean(Address.class)); 
				
				Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

			
			
		}
			
	}
}
