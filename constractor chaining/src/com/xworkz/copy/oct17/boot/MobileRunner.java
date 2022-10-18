package com.xworkz.copy.oct17.boot;

import com.xworkz.copy.oct17.MobileCharger;

public class MobileRunner {

	public static void main(String[] args) {
		String[] types={"nokia","vivo"};
		String[] color= {"black","white","red"};
		String[] shopName= {"natraj","sanjay","arun"};
		String[] usersName= {"arun","natraj","natraj"};
		String[] ingrediants= {"plastic","wire","converter","sensor"};
	 	
		
		MobileCharger mobile=new MobileCharger  ("vivo",70000,1.0,1f,"square",types,color,shopName,usersName,ingrediants);
		
	
	     mobile.display();

	}

} 
