package com.durgesh.myapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean
	public Person person()
	{
		return new Person();
	}
	
	@Bean
	public Food food()
	{
		return new Food();
	}

}
