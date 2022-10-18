package com.xworkz.copy.oct17.boot;

import com.xworkz.copy.oct17.Cake;

public class CakeRunner {

	public static void main(String[] args) {
		String[] types={"honeycake","chocolate cake,"};
		String[] color= {"black","white","red"};
		String[] workersName= {"natraj","sanjay","arun"};
		String[] coustomersName= {"arun","natraj","natraj"};
		String[] ingrediants= {"myda","sugar","water"};
	 	
		
		Cake cake=new Cake("honeycake",150,1.0,12f,"round",types,color,workersName,coustomersName,ingrediants);
		
       cake.display();
       
	}

}
 