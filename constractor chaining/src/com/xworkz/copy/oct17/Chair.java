package com.xworkz.copy.oct17;

import com.xworkz.copy.oct17.javac.constent.ChairColor;

public class Chair {

	public String name;
	public char type;
	public int price;
	public double weight;
	public float height;
	public boolean comfertable;
	public ChairColor chairColor=ChairColor.WHITE;

	
	public Chair()
	{
		System.out.println("empty");
	}
	//
	public Chair(String name) 
	{
		this();
		
	}
	//
	public Chair(String name,char type)
	{
		this(name);
		this.type=type;
	}
	//
	public Chair(String name,char type,int price) 
	{
		this(name,type);
		this.price=price;
	}
	//
	public Chair(String name,char type,int price,double weight)
	{
		this(name,type,price);
		this.weight=weight;	
	}
	//
	public Chair(String name,char type,int price,double weight,float height)
	{
		this(name,type,price,weight);
		this.height=height;
    }
	//
	public Chair(String name,char type,int price,double weight,float height,boolean comfertable)
	{
		this(name,type,price,weight,height);
		this.comfertable =comfertable;	
	}
	//
	public Chair (String name,char type,int price,double weight,float height,boolean comfertable,ChairColor chairColor) {
		this(name,type,price,weight,height,comfertable);
		this.chairColor=chairColor;
		
	}
	
	
	
}
