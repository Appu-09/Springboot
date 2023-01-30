package com.Springproject.SpringExample;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.Springproject.SpringExample.enterprise.web.MyWebController;
import com.Springproject.SpringExample.game.GameRunner;
import com.Springproject.SpringExample.game.PacManGame;
  
@SpringBootApplication
public class SpringExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringExampleApplication.class, args);
		//MarioGame game = new MarioGame();
		//SuperContractGame game = new SuperContractGame();
		
		//GamingConsole game = new MarioGame();
		//GameRunner runner = new GameRunner(game);
		
		GameRunner runner = context.getBean(GameRunner.class);
        runner.run();

		MyWebController controller = context.getBean(MyWebController.class); 
		
		System.out.println(controller.returnValueFromBusinessService());
	}

}
