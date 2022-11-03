package encapsulation.com.xworkz.boot;

import encapsulation.com.xworkz.Electricbulp;
import encapsulation.com.xworkz.Electricbulpmodifyier;

public class ElectricbulpRunner {

	public static void main(String[] args) {
		
		Electricbulp electricbulp=new Electricbulp("home",100.23,"sharath",200.4f,"natraj","white","arun",300,"vvpura","gani");
		
		Electricbulpmodifyier electricbulpmodifyier=new Electricbulpmodifyier();
		
		electricbulpmodifyier.useElectricbulp(electricbulp);
		System.out.println(electricbulp.getBrand());
		
		electricbulp.display();

	}

}
