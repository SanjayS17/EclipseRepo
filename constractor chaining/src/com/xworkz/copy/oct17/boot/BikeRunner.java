package com.xworkz.copy.oct17.boot;

import com.xworkz.copy.oct17.Bike;
import com.xworkz.copy.oct17.javac.constent.Type;

public class BikeRunner {


		public static void main(String[] args) {
			
			String[] color= {"black","white",};
			String[] showRoomName= {"mohan","manu","arun"};
			String[] usersName= {"arun","mohan","natraj"};
			String[] newFeatures= {"shelpstarter","new shape"};
		 	
			
			Bike bike=new Bike ("dell",70000,1.0,1f,"square",Type.PULSAR, color,showRoomName,usersName,newFeatures);
			
		
			bike.display(); 

	}

}
