package com.xworkz.copy.oct.boot;

import com.xworkz.copy.oct.*;

public class FishRunner {

	public static void main(String[] args) {
	 Fish fish = new Fish();
	 System.out.println("Created fish");
	 
	 Fish fish1=new Fish("Anjal");
	 System.out.println(fish1.name);
	 
	 Fish fish2=new Fish(120);
	 System.out.println(fish2.price);
	 
	 Fish fish3=new Fish("bangda" +300.326465);
	 System.out.println(fish3.name+" "+fish3.price);
	 
     Fish fish4=new Fish("m");
     System.out.println(fish4.length);
     
     Fish fish5=new Fish("s"+""+140);
     System.out.println(fish5.length+""+fish5.price);
     
     Fish fish6=new Fish("shark"+120.00+"l");
     System.out.println(fish6.type+" "+fish6.weight+" "+fish6.length);
     
     Fish fish7=new Fish("l"+""+"bangda");
     System.out.println(fish7.length+""+fish7.name);
     
     
     
     
     
	}

}
