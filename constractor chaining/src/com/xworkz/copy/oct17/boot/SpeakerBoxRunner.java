package com.xworkz.copy.oct17.boot;

import com.xworkz.copy.oct17.SpeakerBox;

public class SpeakerBoxRunner {



	public static void main(String[] args) {
		String[] brand= {"boat","Mi","one+"};
		String[] color= {"black","brown","blue"};
		String[] type= {"Portable Bluetooth","Wireless"};
	    String[] workerName= {"arun1","arun2","arun3"};
	    String[] coustomerName= {"Sanjay","arun1","nataraj"};
		String[] ingredients= {"wood","wire","DC"};
		
		 SpeakerBox speakerbox=new  SpeakerBox("Mi",3000,1*1,2,"rectangular",brand,color,
				 type,workerName,coustomerName,ingredients);
		
		 speakerbox.display();

	}

	

}
