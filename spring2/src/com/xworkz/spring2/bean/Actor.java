package com.xworkz.spring2.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("actor")
public class Actor {
	private String name;
	private String language;
	private int age;

	public Actor() {
		System.out.println("running constructor actor");
	}

	@Value("darshan")
	public void setName(String name) {
		this.name = name;
	}

	@Value("kannada")
	void setLanguage(String language) {
		this.language = language;
	}

	@Value("30")
	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getLanguage() {
		return language;
	}

	public int getAge() {
		return age;
	}

}
