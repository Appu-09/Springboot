package com.Springproject.SpringExample.game;

import org.springframework.beans.factory.annotation.Autowired;

//@Component
public class GameRunner {
	
	@Autowired
	
	private  GamingConsole game;

	public GameRunner(GamingConsole  game) {
		this.game = game;
	
	}

	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
		
	}

}
