package com.xworkz.copy.oct17.boot;

import com.xworkz.copy.oct17.Pen;

public class PenRunner {
			
			public static void main(String[]args) {
			String[] brand= {"reynoadls","bright","marker"};
				String[] color= {"bule","red","green"};
				String[] type= {"ballpen,gellpen,inkpen"};
			    String[] workerName= {"ballpen,gelpen,inkpen"};
			    String[] coustomerName= {"arun","arun1","arun2"};
				String[] ingredients= {"color","ink","water"};
				
				Pen pen=new Pen("bright",20,5.5,15,"round",brand,color,type,workerName,coustomerName,ingredients);
				
				pen.display();
				
			}

		

	

}
