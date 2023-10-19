package com.virus.learnspringframework.game;

import org.springframework.context.annotation.Bean;

public class GameRunner {
	
	GamingConsole game; 
	
	public GameRunner(GamingConsole game) {
		this.game = game; 
	}
	
	@Bean
	public void run() {
		System.out.println("Running game: " + game); 
		game.up(); 
		game.down();
		game.left();
		game.right();
		
		
		
	}

}
