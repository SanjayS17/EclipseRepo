package encapsulation.com.xworkz.boot;

import encapsulation.com.xworkz.things.Shampo;
import encapsulation.com.xworkz.things.Shampomodifyier;

public class ShampoRunner {

	public static void main(String[] args) {
		
		Shampo shampo=new Shampo("hairs",100.45,"anushka",12.45f,"sharath","white","natraj",120,"whitefield","ganesh");
		Shampomodifyier shampomodifyier=new Shampomodifyier();
		shampomodifyier.useShampo(shampo);
		System.out.println(shampo.getBrand());
		
		shampo.display();

	}

}
