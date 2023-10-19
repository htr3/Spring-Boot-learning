package com.virus.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.virus.learnspringframework.game.GameRunner;
import com.virus.learnspringframework.game.GamingConsole;

public class App03GamingSpringBeans {
	
	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run(); 
		}
		 
		
		
		
		
//		var game = new PacMan(); 
////		var game = new MarioGame(); 
////		var game = new SuperContraGame(); 
//		var gameRunner = new GameRunner(game); 
//		gameRunner.run(); 
//		
	}
}
