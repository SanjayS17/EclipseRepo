package com.xworkz.copy.oct17;

public class Pen {

		public String name;
		public int price;
		public double weight;
		public float height;
		public String shape;
		public String[] color;
		public String[] brand;
		public String[] type;
		public String[] workerName;
		public String[] coustomerName;
		public String[] ingredients;
		
		public Pen(String name ,int price, double weight, float hegiht,
				String shape, String[] color,String[] brand, String []type, String[] workerName,String[] coustomerName, String[] ingredients) {
			this.name=name;
			this.price=price;
			this.weight=weight;
			this.height=hegiht;
			this.shape=shape;
			this.color=color;
			this.brand=brand;
			this.type=type;
			this.workerName=workerName;
			this.coustomerName=coustomerName;
			this.ingredients=ingredients;
			
			System.out.println("pen const...with arguments..");
			
			
				
			}
					public void display() {
						
						System.out.println(this.name);
						System.out.println(this.price);
						System.out.println(this.weight);
						System.out.println(this.height);
						System.out.println(this.shape);
						
						
						for (int i = 0; i <this. brand.length; i++) {
						    String pen=brand[i];
						    System.out.println(pen);
						}
						for (int i = 0; i < this.color.length; i++) {
						    String pen=color[i];
						    System.out.println(pen);
						}
						for (int i = 0; i < this.type.length; i++) {
						    String pen=type[i];
						    System.out.println(pen);
						}
						for (int i = 0; i < this.workerName.length; i++) {
						    String pen= workerName[i];
						    System.out.println(pen);
						}
						for (int i = 0; i <this. coustomerName.length; i++) {
						    String pen=coustomerName[i];
						    System.out.println(pen);
						}
						for (int i = 0; i <this.ingredients .length; i++) {
						    String pen=ingredients[i];
						    System.out.println(pen);
						}
						
						
						
						
						
					}
}
