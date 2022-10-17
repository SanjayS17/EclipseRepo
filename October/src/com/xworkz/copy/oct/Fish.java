package com.xworkz.copy.oct;

public class Fish {
	
	public String name;
	public String type;
	public int price;
	public double weight;
	public float length;
	
	public Fish() {
		System.out.println("fish fray");
	}
	

	public Fish(String name) {
		this.name=name;
		System.out.println("ceated using String");
	}
	
	public Fish(int price) {
		this.price=price;
		System.out.println("created using int");
	}
	public Fish(String name, int price) {
		this.name=name;
		this.price=price;
		System.out.println("created using string and int");
	}
	public Fish(float length) {
		this.length=length;
		System.out.println("created using float");
	}
	public Fish(float length,String name) {
		this.length=length;
		this.name=name;
		System.out.println("created by using float and string");
	}
	public Fish(float length,int price) {
		this.length=length;
		this.price=price;
		System.out.println("created by using float and double");
	}
	public Fish(String type,double weight,float length) {
		this.type=type;
		this.weight=weight;
		this.length=length;
		System.out.println("created by usin Stringand float and double");
	}

	
}
