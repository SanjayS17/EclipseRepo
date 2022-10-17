package com.xworkz.copy.oct.boot;
import com.xworkz.copy.oct.*;
public class TractorRunner {

	public static void main(String[] args) {
	
		
		Tractor tractor=new Tractor("sonalika",800000);
		System.out.println(tractor.name);
		System.out.println(tractor.brand);
		System.out.println(tractor.price);
		System.out.println(tractor.color);
		System.out.println(tractor.hp);
		System.out.println(tractor.model);
		
		tractor=new Tractor(80000,"sonalika","sona");
		System.out.println(tractor.name);
		System.out.println(tractor.price);
		System.out.println(tractor.brand);
		System.out.println(tractor.hp);
		
		tractor=new Tractor("sonalika",800000,"sona",120,"rx 35 mahabali");
		System.out.println(tractor.name);
		System.out.println(tractor.price);
		System.out.println(tractor.brand);
		System.out.println(tractor.hp);
		System.out.println(tractor.model);
		
		tractor=new Tractor("sonalika",800000,"sona",120,"rx 35 mahabali","blue");
		System.out.println(tractor.name);
		System.out.println(tractor.price);
		System.out.println(tractor.brand);
		System.out.println(tractor.hp);
		System.out.println(tractor.model);
		System.out.println(tractor.color);
		
		tractor=new Tractor("sonalika");
		System.out.println(tractor.name);
		
	}

}
