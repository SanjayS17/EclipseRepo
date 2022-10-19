package com.xworkz.copy.oct17;

public class TextileShop {


	public String name;
	public int price;
	public double weight;
	public float height;
	public String shape;
	public String[] type; 
	public String[] color;
	public String[] workersName;
	public String[] coustomersName;
	public String[] clothBrands;
	
	
	public  Textileshop (String name,int price,double weight,float height,String shape,
			String[] type,String[]color,String[]workersName,
			String[]coustomersName,String[]clothBrands ){
		
		this.name=name;
		this.price=price;
		this.weight=weight;
		this.height=height;
		this.shape=shape;
		this.type=type;
		this.color=color;
		this.workersName= workersName;
		this.coustomersName= coustomersName;
		this.clothBrands= clothBrands;
		
		System.out.println(" Textileshop const...with arguments..");
		
	}
		public void display() {
			
			System.out.println(this.name);
			System.out.println(this.price);
			System.out.println(this.weight);
			System.out.println(this.height);
			System.out.println(this.shape);
			
			for (int  i = 0; i <type.length; i++) {
				String Textileshop=type[i];
	            System.out.println(Textileshop);  
			}
			

			for (int i = 0; i < this.color.length; i++) {
				String Textileshop=color[i];
				System.out.println(Textileshop);	
			}
			
			for (int i = 0; i <this.workersName.length; i++) {
				String name=workersName[i];
				System.out.println(name);	
			}
			for (int i = 0; i < this.coustomersName.length; i++) {
				String name=coustomersName[i];
				System.out.println(name);
			}
			for (int i = 0; i < this.clothBrands.length; i++) {
				String name=clothBrands[i];
				System.out.println(name);	
			}
			
		}
	
}
