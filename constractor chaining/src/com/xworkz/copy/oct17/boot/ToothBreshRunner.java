package com.xworkz.copy.oct17.boot;

import com.xworkz.copy.oct17.ToothBresh;

public class ToothBreshRunner {

	
	public static void main(String[] args) {
			String[] types={"colgate","pepsident"};
			String[] color= {"black","white","red"};
			String[] shopName= {"natraj","sanjay","arun"};
			String[] coustomersName= {"arun","natraj","natraj"};
			String[] ingrediants= {"plastic","rubber","fiber"};
		 	
			
			ToothBresh toothBresh=new ToothBresh  ("colgate",15,1.0,11f,"round",types,color,shopName,coustomersName,ingrediants);
			
		
		     toothBresh.display();
}

	}


