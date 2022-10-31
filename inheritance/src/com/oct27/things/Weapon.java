package com.oct27.things;

public class Weapon {

	public String name;
	public String use;
	public double Weight;
	
	
	public Weapon(String name,String use,double Weight) {
		super();
		this.name=name;
		this.use=use;
		this.Weight=Weight;
	}
	//
	public void expose() {
		System.out.println("name:"+name);
		System.out.println("use:"+use);
		System.out.println("Weight:"+Weight);
		
	}
}
