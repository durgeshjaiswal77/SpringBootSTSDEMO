package com.durgesh.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MyFirstBootAppApplication {

	public static void main(String[] args) {
		//ApplicationContext con1 = SpringApplication.run(MyFirstBootAppApplication.class, args);
	
		ApplicationContext con = new AnnotationConfigApplicationContext(Config.class);
		Person person=con.getBean(Person.class);
		person.speak();
		person.eat();
	}

}
