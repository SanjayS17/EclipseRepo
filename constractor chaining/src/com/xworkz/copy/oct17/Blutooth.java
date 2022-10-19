package com.xworkz.copy.oct17;

import com.xworkz.copy.oct17.javac.constent.Bname;

public class Blutooth {


	public String name;
	public int price;
	public double weight;
	public float height;
	public String shape;
	public Bname bname=Bname.BOAT;
	public String[] color;
	public String[] showRoomName;
	public String[] usersName;
	public String[] newFeatures;
	
	
	public Blutooth (String name,int price,double weight,float height,
			String shape,Bname bname,String[]color,String[]showRoomName,String[]usersName,String[]newFeatures) {
		
		this.name=name;
		this.price=price;
		this.weight=weight;
		this.height=height;
		this.shape=shape;
		this.bname=bname;
		this.color=color;
		this.showRoomName= showRoomName;
		this.usersName= usersName;
		this.newFeatures= newFeatures;
		
		System.out.println("Blutooth const...with arguments..");
		
	}
		public void display() {
			
			System.out.println(this.name);
			System.out.println(this.price);
			System.out.println(this.weight);
			System.out.println(this.height);
			System.out.println(this.shape);
			System.out.println(this.bname);
		 
						

			for (int i = 0; i < this.color.length; i++) {
				String Blutooth=color[i];
				System.out.println(Blutooth);	
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
