package com.xworkz.spring2.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring2.bean.Actor;
import com.xworkz.spring2.bean.Flower;
import com.xworkz.spring2.bean.Rocket;
import com.xworkz.spring2.configuration.BiscuitConfiguration;

public class FlowerRunner {

	public static void main(String[] args) {

		ApplicationContext container=new AnnotationConfigApplicationContext(BiscuitConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		
		Flower refOfFlower=container.getBean("flower",Flower.class);
		System.out.println(refOfFlower);
		System.out.println(refOfFlower.getColor());
		System.out.println(refOfFlower.getPrice());
		System.out.println(refOfFlower.getName());
		
		
		Flower refOfFlower2=container.getBean("rose",Flower.class);
		System.out.println(refOfFlower2);
		System.out.println(refOfFlower2.getColor());
		System.out.println(refOfFlower2.getPrice());
		System.out.println(refOfFlower2.getName());
		

		Rocket refOfRocket=container.getBean("rocket",Rocket.class);
		System.out.println(refOfRocket);
		System.out.println(refOfRocket.getCountry());
		System.out.println(refOfRocket.getName());
		System.out.println(refOfRocket.getBudget());
		
		Rocket refOfRocket1=container.getBean("msl",Rocket.class);
		System.out.println(refOfRocket1);
		System.out.println(refOfRocket1.getCountry());
		System.out.println(refOfRocket1.getName());
		System.out.println(refOfRocket1.getBudget());
		
		Actor refOfActor=container.getBean("actor",Actor.class);
		System.out.println(refOfActor);
		System.out.println(refOfActor.getName());
		System.out.println(refOfActor.getLanguage());
		System.out.println(refOfActor.getAge());
		
		Actor refOfActor1=container.getBean("actor1",Actor.class);
		System.out.println(refOfActor1);
		System.out.println(refOfActor1.getName());
		System.out.println(refOfActor1.getLanguage());
		System.out.println(refOfActor1.getAge());
		
	
		
	}

}













