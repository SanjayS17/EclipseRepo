package com.xworkz.spring4.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Snake {
	
	private String name;
	@Autowired
	private double length;
	@Autowired
	private String color;
	private String type;
	private boolean poisionous;
	
	@Autowired
	public Snake(@Qualifier("snakename")String name,@Qualifier("snaketype") String type, @Qualifier("snakepoisionous")boolean poisionous) {
		super();
		this.name = name;
		this.type = type;
		this.poisionous = poisionous;
	}

	@Override
	public String toString() {
		return "Snake [name=" + name + ", length=" + length + ", color=" + color + ", type=" + type + ", poisionous="
				+ poisionous + "]";
	}

	public String getName() {
		return name;
	}
	public double getLength() {
		return length;
	}
	public String getColor() {
		return color;
	}
	public String getType() {
		return type;
	}
	public boolean isPoisionous() {
		return poisionous;
	}

	
	
	
	

}
