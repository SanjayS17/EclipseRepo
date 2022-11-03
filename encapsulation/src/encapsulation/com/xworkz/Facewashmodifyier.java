package encapsulation.com.xworkz;

public class Facewashmodifyier {

	Facewash facewash;
	public void useFacewash(Facewash facewash) {
		System.out.println(facewash.getBrand());
		facewash.setBrand("nevia");
	
		
	}
}
