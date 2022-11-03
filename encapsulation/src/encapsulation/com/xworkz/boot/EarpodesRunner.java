package encapsulation.com.xworkz.boot;

import encapsulation.com.xworkz.Earpodes;
import encapsulation.com.xworkz.EarpodesAccess;

public class EarpodesRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		Earpodes po = new Earpodes();
		EarpodesAccess acc = new EarpodesAccess();
		
		acc.pode(po);
		
		System.out.println(System.lineSeparator());
		
		System.out.println(po. getName());
		System.out.println(po. getSeries());
		System.out.println(po. getCompany());
		System.out.println(po. getNoOfVersion());
		System.out.println(po. isReadiator());
		System.out.println(po. getFps());
		System.out.println(po. getChipSet());
		
		System.out.println(po. getGraphicsEngine());
		System.out.println(po. getMemoryInterface());
		
		System.out.println(po. getSpeed());
		
		System.out.println(po. getProcessor());
	
	
	
	}

}
