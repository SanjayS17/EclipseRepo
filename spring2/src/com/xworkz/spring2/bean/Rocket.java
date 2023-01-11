package com.xworkz.spring2.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rocket {
	private String Country;
	private String name;
	private double budget;
	
	public Rocket(@Value("india")String Country,@Value("pslv")String name,@Value("1.23434")Double budget) {
		this.Country = Country;
		this.name = name;
		this.budget = budget;
	}


	public String getCountry() {
		return Country;
	}

	public String getName() {
		return name;
	}

	public double getBudget() {
		return budget;
	}

	
	

}
