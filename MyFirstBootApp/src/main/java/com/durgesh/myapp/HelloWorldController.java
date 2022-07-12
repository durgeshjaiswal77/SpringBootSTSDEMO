package com.durgesh.myapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping("/")
	public String hello()
	{
		return "Hello Spring Boot Your welcome in our world";
	}
	
	@RequestMapping("/Home")
	public String home()
	{
		return "Your Welcome in Home Page";
	}
	
	@RequestMapping("About")
	public String About()
	{
		return "Your welcome in About Page";
	}

}
