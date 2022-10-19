package com.xworkz.copy.oct17;

import com.xworkz.copy.oct17.javac.constent.Ownernames;

public class Home {
   public String name;
   public Ownernames ownernames=Ownernames.SANJAY;
   public int price;
   public double weight;
   public float height;
   public String[]color;
   public String[] username;
   public String[]type;
   public int[]houseno;
   public float[]homelengths;
   
   public Home(String name,Ownernames ownernames,int price,double weight,float height,String[]color,
		   String[]username,String[]type,int[]houseno,float[]homelengths) {
		
	        this.name=name;
	        this. ownernames= ownernames;
	        this.price=price;
	        this.weight=weight;
	        this.height=height;
	        this.color=color;
	        this.username=username;
	        this.type=type;
	        this.houseno=houseno;
	        this.homelengths=homelengths;
	        System.out.println("Home creat... by  const...");
   }    
	        public void display() {
	        	System.out.println(this.name);
	        	System.out.println(this.ownernames);
	        	System.out.println(this.price);
	        	System.out.println(this.weight);
	        	System.out.println(this.height);
	        	for (int i = 0; i < this.color.length; i++) {
					String Home=color[i];
					System.out.println(Home);
				}
	        	for (int i = 0; i < this.username.length; i++) {
					String Home=username[i];
					System.out.println(Home);
				}
	        	for (int i = 0; i < this.type.length; i++) {
					String Home=type[i];
					System.out.println(Home);
				}
	        	for (int i = 0; i < this.houseno.length; i++) {
					int Home=houseno[i];
					System.out.println(Home);
				}
	        	for (int i = 0; i< this.homelengths.length; i++) {
					float Home=homelengths[i];
					System.out.println(Home);
				}
	        
   }
}
