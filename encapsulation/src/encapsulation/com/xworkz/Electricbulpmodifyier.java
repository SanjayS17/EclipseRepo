package encapsulation.com.xworkz;

public class Electricbulpmodifyier {

	Electricbulp electricbulp;
	public void useElectricbulp(Electricbulp electricbulp) {
		System.out.println(electricbulp.getBrand());
		electricbulp.setBrand("philips");
		
	}
	
}
