package encapsulation.com.xworkz.boot;

import encapsulation.com.xworkz.things.Powder;
import encapsulation.com.xworkz.things.Powdermodifying;

public class PowderRunner {

	public static void main(String[] args) {
	
		Powder powder=new Powder("face",120,"anushka", 123.33f,"natraj","white","arun",145,"hsrlayout","ganesh");
		
		Powdermodifying powdermodifying =new Powdermodifying();
		powdermodifying.usePowder(powder);
		System.out.println(powder.getBrand());
		
		powder.display();
		
	}

}
