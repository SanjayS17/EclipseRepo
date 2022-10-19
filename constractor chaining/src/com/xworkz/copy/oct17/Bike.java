package com.xworkz.copy.oct17;

import com.xworkz.copy.oct17.javac.constent.Type;

public class Bike {

	public String name;
	public int price;
	public double weight;
	public float height;
	public String shape;
	public Type type=Type.PULSAR;
	public String[] color;
	public String[] showRoomName;
	public String[] usersName;
	public String[] newFeatures;
	
	
	public Bike(String name,int price,double weight,float height,String shape,Type type,String[]color,String[]showRoomName,String[]usersName,String[]newFeatures) {
		
		this.name=name;
		this.price=price;
		this.weight=weight;
		this.height=height;
		this.shape=shape;
		this.type=type;
		this.color=color;
		this.showRoomName= showRoomName;
		this.usersName= usersName;
		this.newFeatures= newFeatures;
		
		System.out.println("Bike const...with arguments..");
		
	}
		public void display() {
			
			System.out.println(this.name);
			System.out.println(this.price);
			System.out.println(this.weight);
			System.out.println(this.height);
			System.out.println(this.shape);
			System.out.println(this.type);
		 
						

			for (int i = 0; i < this.color.length; i++) {
				String Bike=color[i];
				System.out.println(Bike);	
			}
			
			for (int i = 0; i <this.showRoomName.length; i++) {
				String name=showRoomName[i];
				System.out.println(name);	
			}
			for (int i = 0; i < this.usersName.length; i++) {
				String name=usersName[i];
				System.out.println(name);
			}
			for (int i = 0; i < this.newFeatures.length; i++) {
				String name=newFeatures[i];
				System.out.println(name);	
			}
			
		}
	
}
