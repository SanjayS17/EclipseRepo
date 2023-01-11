package com.xworkz.spring2.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component 
public class Flower {
	@Value("Lotus")
	private String name;
	@Value("white&Black")
	private String color;
	@Value("12")
	private String price;
	
	public Flower() {
     System.out.println("created flower using default constructer");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}


	
	

}
