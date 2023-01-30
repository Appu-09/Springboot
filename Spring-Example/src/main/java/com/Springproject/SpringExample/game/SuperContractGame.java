package com.Springproject.SpringExample.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContractGame implements GamingConsole{
	
	public void up() {
		System.out.println("SuperContractGame up");
	}

	public void down() {
		System.out.println("SuperContractGame down");
	
}

	public void left() {
		System.out.println(" SuperContractGame left");
	}
	
	public void right() {
		System.out.println(" SuperContractGame right");
	}
}