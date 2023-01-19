package com.xworkz.spring4.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	private String name;
	private String type;
	@Autowired
	private int number;
	@Autowired
	private double version;
	private String company;
	private int stroke;
	
	@Autowired
	public Engine(@Qualifier("enginename")String name,@Qualifier("enginetype") String type, @Qualifier("enginecompany")String company) {
		super();
		this.name = name;
		this.type = type;
		this.company = company;
	}
	

	@Override
	public String toString() {
		return "Engine [name=" + name + ", type=" + type + ", number=" + number + ", version=" + version + ", company="
				+ company + ", stroke=" + stroke + "]";
	}


	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public int getNumber() {
		return number;
	}
	public double getVersion() {
		return version;
	}
	public String getCompany() {
		return company;
	}
	public int getStroke() {
		return stroke;
	}
	

}
