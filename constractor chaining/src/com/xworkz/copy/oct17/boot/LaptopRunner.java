package com.xworkz.copy.oct17.boot;

import com.xworkz.copy.oct17.Laptop;

public class LaptopRunner {

	public static void main(String[] args) {
		String[] types={"dell","hp"};
		String[] color= {"black","white",};
		String[] shopName= {"mohan","manu","arun"};
		String[] usersName= {"arun","mohan","natraj"};
		String[] ingrediants= {"plastic","wire","battery","sensor"};
	 	
		
		Laptop laptop=new Laptop ("dell",70000,1.0,1f,"square",types,color,shopName,usersName,ingrediants);
		
	
		laptop.display(); 

	}

}
