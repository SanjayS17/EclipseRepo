package com.xworkz.copy.oct17;



public class SpeakerBox {
	public String name;
	public int price;
	public double weight;
	public float height;
	public String rectangular;
	public String[] color;
	public String[] brand;
	public String[] type;
	public String[] workerName;
	public String[] coustomerName;
	public String[] ingredients;
	
	public  SpeakerBox(String name ,int price, double weight, float hegiht,String shap, String[] color,String[] brand, String []type, String[] workerName,String[] coustomerName, String[] ingredients) {
		this.name=name;
		this.price=price;
		this.weight=weight;
		this.height=hegiht;
		this.rectangular=rectangular;
		this.color=color;
		this.brand=brand;
		this.type=type;
		this.workerName=workerName;
		this.coustomerName=coustomerName;
		this.ingredients=ingredients;
		
		System.out.println("SpeakerBox const...with arguments..");
		
		
			
		}
				public void display() {
					
					System.out.println(this.name);
					System.out.println(this.price);
					System.out.println(this.weight);
					System.out.println(this.height);
					System.out.println(this.rectangular);
					
					
					for (int i = 0; i < brand.length; i++) {
					    String speakerBox=brand[i];
					    System.out.println("boat");
					}
					for (int i = 0; i < color.length; i++) {
					    String speakerBox=color[i];
					    System.out.println("black");
					}
					for (int i = 0; i < type.length; i++) {
					    String speakerBox=type[i];
					    System.out.println("tractorSpeaker");
					}
					for (int i = 0; i < workerName.length; i++) {
					    String speakerBox= workerName[i];
					    System.out.println("arun");
					}
					for (int i = 0; i < coustomerName.length; i++) {
					    String speakerBox=coustomerName[i];
					    System.out.println("sanjay");
					}
					for (int i = 0; i <ingredients .length; i++) {
					    String speakerBox=ingredients[i];
					    System.out.println("speaker");
					}
					
						
		
}
}
