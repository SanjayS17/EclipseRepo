package com.xworkz.copy.oct17.boot;

import com.xworkz.copy.oct17.Bus;
import com.xworkz.copy.oct17.javac.constent.BusType;

public class BusRunner {

	

		public static void main(String[] args) {
			
			String[]color= {"white","red","black"};
			String[]showRoomName= {"ashokleyland","mahindra"};
			String[]usersName= {"sanjay","natraj","arun"};
			String[]newFeatures= {"ac coach","extraseat"};
			 
			Bus bus=new Bus ("private",800000,100,1f,"vectorart",BusType.KSRTC,color,showRoomName,usersName,newFeatures); 
				
			bus.display();

		}
	 

	

}
