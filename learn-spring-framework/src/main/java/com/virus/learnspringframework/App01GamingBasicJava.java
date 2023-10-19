package com.virus.learnspringframework;

import com.virus.learnspringframework.game.GameRunner;
import com.virus.learnspringframework.game.PacMan;

public class App01GamingBasicJava {
	
	public static void main(String[] args) {
		
		var game = new PacMan(); 
//		var game = new MarioGame(); 
//		var game = new SuperContraGame(); 
		var gameRunner = new GameRunner(game); 
		
		gameRunner.run(); 
		
	}
}
