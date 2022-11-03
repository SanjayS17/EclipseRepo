package encapsulation.com.xworkz.boot;

import encapsulation.com.xworkz.Facewash;
import encapsulation.com.xworkz.Facewashmodifyier;

public class FacewashRunner {

	public static void main(String[] args) {
		
		Facewash facewash=new Facewash("face",100,"amir",123.44f,"arun","brown","natraj",120,"rrnagar","ganesh");

		Facewashmodifyier facewashmodifyier=new Facewashmodifyier();
		
		facewashmodifyier.useFacewash(facewash);
		
		System.out.println(facewash.getBrand());
		
		facewash.display();
		
	}

}
