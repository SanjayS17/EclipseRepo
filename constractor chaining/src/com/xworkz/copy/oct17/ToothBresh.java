package com.xworkz.copy.oct17;
 
public class ToothBresh {

		public String name;
		public int price;
		public double weight;
		public float height;
		public String shape;
		public String[] type; 
		public String[] color;
		public String[] shopName;
		public String[] coustomersName;
		public String[] ingredients;
		
		
		public ToothBresh(String name,int price,double weight,float height,String shape,String[] type,String[]color,String[]shopName,String[]coustomersName,String[]ingredients) {
			
			this.name=name;
			this.price=price;
			this.weight=weight;
			this.height=height;
			this.shape=shape;
			this.type=type;
			this.color=color;
			this.shopName= shopName;
			this.coustomersName= coustomersName;
			this.ingredients= ingredients;
			
			System.out.println(" ToothBresh const...with arguments..");
			
		}
			public void display() {
				
				System.out.println(this.name);
				System.out.println(this.price);
				System.out.println(this.weight);
				System.out.println(this.height);
				System.out.println(this.shape);
				
				for (int  i = 0; i <type.length; i++) {
					String toothBresh=type[i];
		            System.out.println(toothBresh);  
				}
				

				for (int i = 0; i < this.color.length; i++) {
					String toothBresh=color[i];
					System.out.println(toothBresh);	
				}
				
				for (int i = 0; i <this.shopName.length; i++) {
					String name=shopName[i];
					System.out.println(name);	
				}
				for (int i = 0; i < this.coustomersName.length; i++) {
					String name=coustomersName[i];
					System.out.println(name);
				}
				for (int i = 0; i < this.ingredients.length; i++) {
					String name=ingredients[i];
					System.out.println(name);	
				}
				
			}
		
}
