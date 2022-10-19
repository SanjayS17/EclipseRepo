package com.xworkz.copy.oct17.boot;

import com.xworkz.copy.oct17.Home;
import com.xworkz.copy.oct17.javac.constent.Ownernames;

public class HomeRunner {

	public static void main(String[] args) {
		String[]color= {"black","white","red"};
		String[]username= {"sanjay","ganesh","sharath"};
		String[]type= {"2bhk","3bhk","1bhk"};
		int[]houseno= {1,2,3,4};
		float[]homelengths= {12f,13f,14f};
		
		Home home=new Home("arunhome",Ownernames.SANJAY,12000,122,
				12f,color,username,type,houseno,homelengths);
		home.display();

	}

}
