package classs.com.boot;

import classs.com.Vehicle;

public class VehicleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle=new Vehicle("blue","tractor","sonalika",10.34,"castiron",2016,true,true,123.34,12.1234f);
		System.out.println(vehicle);
		
		
		
		Vehicle vehicle1=new Vehicle("red","tractor","mahindra",12.34,"castiron",2017,true,false,132.22,12.234f);
		System.out.println(vehicle1);
		
		vehicle=vehicle1;
		boolean run=vehicle.equals(vehicle1);
		System.out.println(run);
		

	}

}



