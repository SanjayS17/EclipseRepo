package com.xworkz.copy.oct17.boot;

import com.xworkz.copy.oct17.Car;
import com.xworkz.copy.oct17.javac.constent.CarType;

public class CarRunner {

	public static void main(String[] args) {
		
		String[]color= {"white","red","black"};
		String[]showRoomName= {"duster","ciaze"};
		String[]usersName= {"sanjay","natraj","arun"};
		String[]newFeatures= {"extraseat","extrasize"};
		 
		 Car car=new Car ("duster",80000,100,1f,"vectorart",CarType.DUSTER,color,showRoomName,usersName,newFeatures); 
			
	    car.display();

	}
 
}
