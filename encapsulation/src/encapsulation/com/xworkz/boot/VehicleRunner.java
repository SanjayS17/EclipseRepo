package encapsulation.com.xworkz.boot;

import encapsulation.com.xworkz.things.Bike;
import encapsulation.com.xworkz.things.Vehicle;

public class VehicleRunner {

	public static void main(String[] args) {
		

		Bike bike= new Bike("shelpstarter",123.44,"dhoni",123.45f,"ktm","red",134,"rrnagar","ganesh");
		
		Vehicle vehicle=new  Vehicle();
		vehicle.useBike(bike);
	
		vehicle.useBike(bike);
		bike.display();
	}

}
