package encapsulation.com.xworkz.things;

public class Vehicle {

	
	Bike bike;
	public void useBike(Bike bike) {
		System.out.println(bike.getBrand());
		bike.setBrand("hero");
		
		System.out.println(bike.getshopname());
		bike.setshopname("arun");
		
		
	}
}
