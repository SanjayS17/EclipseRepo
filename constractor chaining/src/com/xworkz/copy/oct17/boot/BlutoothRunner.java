package com.xworkz.copy.oct17.boot;

import com.xworkz.copy.oct17.Blutooth;
import com.xworkz.copy.oct17.javac.constent.Bname;
public class BlutoothRunner {

	public static void main(String[] args) {

			String[] color= {"black","white",};
			String[] showRoomName= {"mohan","manu","arun"};
			String[] usersName= {"arun","mohan","natraj"};
			String[] newFeatures= {"morebatterypower","morebase"};
		 	
			
			Blutooth blutooth=new Blutooth ("dell",70000,1.0,1f,"square",
					Bname.BOAT, color,showRoomName,usersName,newFeatures);
			
		
			blutooth.display(); 

	}

	

}
