package com.xworkz.copy.oct17;

import com.xworkz.copy.oct17.javac.constent.BusType;


public class Bus {

	public String name;
	public int price;
	public double weight;
	public float height;
	public String shape;
	public BusType busType=BusType.KSRTC;
	public String[] color;
	public String[] showroomname;
	public String[] usersname;
	public String[] newfeatures;
	
	
	
	public Bus(String name,int price,double weight,float height,String shape, BusType busType,String[]color,
			String[]showroomname,String[]usersname,String[]newfeatures) {
		this.name=name;
		this.price=price;
		this.weight=weight;
		this.height=height;
		this.shape=shape;
		this.busType=busType;
		this.color=color;
		this.showroomname=showroomname;
		this.usersname=usersname;
		this.newfeatures=newfeatures;
		System.out.println("bus creating by const.......");
		
	}

public void display() {
	System.out.println(this.name);
	System.out.println(this.price);
	System.out.println(this.weight);
	System.out.println(this.height);
	System.out.println(this.shape);
	System.out.println(this.busType);
	
	for (int i = 0; i < this.color.length; i++) {
		String Bus=color[i];
		System.out.println(Bus);
	}
	//
	for (int i = 0; i < this.showroomname.length; i++) {
		String Bus=showroomname[i];
		System.out.println(Bus);
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
