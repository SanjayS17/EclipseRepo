package com.xworkz.spring2.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.spring2.bean.Actor;
import com.xworkz.spring2.bean.Flower;
import com.xworkz.spring2.bean.Rocket;

@Configuration
@ComponentScan("com.xworkz.spring2")
public class BiscuitConfiguration {

	public BiscuitConfiguration() {
        System.out.println("created BiscuitConfiguration... ");
	}
	@Bean
	public Flower rose() {
		System.out.println("registering another flower in spring...");
		Flower flower=new Flower();
		return flower;
	} 
	
	@Bean
	public Rocket msl() {
		System.out.println("registering another rocket in spring.....");
		Rocket rocket=new Rocket("china","msld",12.2324);
		return rocket;
	}
	
	
	
	@Bean
	public Actor actor1() {
		System.out.println("registering another actor in spring...");
		Actor actor=new Actor();
		return actor;
		
	}
}
