package com.xworkz.copy.oct17;

public class Laptop {
	public String name;
	public int price;
	public double weight;
	public float height;
	public String shape;
	public String[] type; 
	public String[] color;
	public String[] shopName;
	public String[] usersName;
	public String[] ingredients;
	
	
	public Laptop(String name,int price,double weight,float height,String shape,String[] type,String[]color,String[]shopName,String[]usersName,String[]ingredients) {
		
		this.name=name;
		this.price=price;
		this.weight=weight;
		this.height=height;
		this.shape=shape;
		this.type=type;
		this.color=color;
		this.shopName= shopName;
		this.usersName= usersName;
		this.ingredients= ingredients;
		
		System.out.println("Laptop const...with arguments..");
		
	}
		public void display() {
			
			System.out.println(this.name);
			System.out.println(this.price);
			System.out.println(this.weight);
			System.out.println(this.height);
			System.out.println(this.shape);
			
			for (int  i = 0; i <type.length; i++) {
				String Laptop=type[i];
	            System.out.println(Laptop);  
			}
			

			for (int i = 0; i < this.color.length; i++) {
				String Laptop=color[i];
				System.out.println(Laptop);	
			}
			
			for (int i = 0; i <this.shopName.length; i++) {
				String name=shopName[i];
				System.out.println(name);	
			}
			for (int i = 0; i < this.usersName.length; i++) {
				String name=usersName[i];
				System.out.println(name);
			}
			for (int i = 0; i < this.ingredients.length; i++) {
				String name=ingredients[i];
				System.out.println(name);	
			}
			
		}
	
}
