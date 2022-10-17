package com.xworkz.copy.oct;

public class Tractor {
	
public String name;
public String brand;
public long price;
public String color;
public int hp;
public String model;

   public Tractor()
{
	System.out.println("default constractor is printimg");
}  
//1
    public Tractor(String name,long price)
{	
	this.name=name;
	this.price=price;
   System.out.println("enter tractor name and brand"); 	
}
//2
    public Tractor(long price,String name,String brand) {
	this(name,price);
	this.brand=brand;
	System.out.println("enter tractor name,,brand and color");
}
//3
    public Tractor(String name,long price,String brand,int hp) {
	this(price,name,brand);
	this.hp=hp;
	System.out.println("enter tractor name,brand,price,hp");
}
//4
    public Tractor(String name,long price,String brand,int hp,String model) {
	this(brand,price,name,hp);
	this.model=model;
	System.out.println("enter tractor name,price,brand,hp,model");	
}
//5
      public Tractor(String name,long price,String brand,int hp,String model,String color) {
	  this(name,price,model,hp,brand);
	  this.color=color;
	  System.out.println("enter tractor name,brand,hp,model and color ");
  }
  //6
    public Tractor(String name) {
	this.name=name;
	System.out.println("enter tractor name");	
}
    //7
  
}
