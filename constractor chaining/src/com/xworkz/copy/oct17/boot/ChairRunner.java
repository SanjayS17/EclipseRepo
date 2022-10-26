package com.xworkz.copy.oct17.boot;

import com.xworkz.copy.oct17.Chair;

public class ChairRunner {

	public static void main(String[] args) {
	
		Chair chair=new Chair("national");
		System.out.println(chair.name);
		
	     chair=new Chair("national",'a');
	     System.out.println(chair.name);
	     System.out.println(chair.type);
	     
	     chair=new Chair("national",'b',50);
	     System.out.println(chair.name);
	     System.out.println(chair.type);
	     System.out.println(chair.price);
		
	     chair=new Chair("national",'c',50,12);
	     System.out.println(chair.name);
	     System.out.println(chair.type);
	     System.out.println(chair.price);
	     System.out.println(chair.weight);
	     
	     chair=new Chair("national",'c',50,12,1.3f);
	     System.out.println(chair.name);
	     System.out.println(chair.type);
	     System.out.println(chair.price);
	     System.out.println(chair.weight);
         System.out.println(chair.height);
         
          
	     chair=new Chair("national",'c',50,12,1.3f,true);
	     System.out.println(chair.name);
	     System.out.println(chair.type);
	     System.out.println(chair.price);
	     System.out.println(chair.weight);
         System.out.println(chair.height);
         System.out.println(chair.comfertable );
         System.out.println(chair.chairColor);
         
         
         
	}

}
