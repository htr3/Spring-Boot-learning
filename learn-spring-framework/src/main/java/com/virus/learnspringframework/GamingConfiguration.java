package com.virus.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.virus.learnspringframework.game.GameRunner;
import com.virus.learnspringframework.game.GamingConsole;
import com.virus.learnspringframework.game.PacMan;

@Configuration
public class GamingConfiguration {

	@Bean
	public GamingConsole game() {
		var game = new PacMan(); 
		return game; 
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);  
		return gameRunner; 
	}
}
