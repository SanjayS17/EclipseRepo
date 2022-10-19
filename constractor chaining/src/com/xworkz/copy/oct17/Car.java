package com.xworkz.copy.oct17;

import com.xworkz.copy.oct17.javac.constent.CarType;

public class Car {

	public String name;
	public int price;
	public double weight;
	public float height;
	public String shape;
	public CarType carType=CarType.DUSTER;
	public String[] color;
	public String[] shoeroomname;
	public String[] usersname;
	public String[] newfeatures;
	
	
	
	public Car(String name,int price,double weight,float height,String shape, CarType carType,String[]color,
			String[]shoeroomname,String[]usersname,String[]newfeatures) {
		this.name=name;
		this.price=price;
		this.weight=weight;
		this.height=height;
		this.shape=shape;
		this.carType=carType;
		this.color=color;
		this.shoeroomname=shoeroomname;
		this.usersname=usersname;
		this.newfeatures=newfeatures;
		System.out.println("car creating by const.......");
		
	}

public void display() {
	System.out.println(this.name);
	System.out.println(this.price);
	System.out.println(this.weight);
	System.out.println(this.height);
	System.out.println(this.shape);
	System.out.println(this.carType);
	
	for (int i = 0; i < this.color.length; i++) {
		String Car=color[i];
		System.out.println(Car);
	}
	//
	for (int i = 0; i < this.shoeroomname.length; i++) {
		String Car=shoeroomname[i];
		System.out.println(Car);
	}
	//
	for (int i = 0; i < this.usersname.length; i++) {
		String Car=usersname[i];
		System.out.println(Car);
	}
	// 
	for (int i = 0; i < this.newfeatures.length; i++) {
		String Car=newfeatures[i];
		System.out.println(Car);
		
	}
	
	
}	
}