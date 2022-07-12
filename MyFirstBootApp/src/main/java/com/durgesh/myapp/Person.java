package com.durgesh.myapp;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	
	@Autowired
	Food food;
	public void speak()
	{
		System.out.println("I can able to speak");
	}
	
	public void eat()
	{
		food.recipes();
	}

}
