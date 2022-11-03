package encapsulation.com.xworkz.boot;

import encapsulation.com.xworkz.Car;
import encapsulation.com.xworkz.Carmodifying;

public class CarRunner {

	public static void main(String[] args) {
	
		Car car=new Car("natraj",213.4,"ganesh",123.34f,"shashi","block",12,"btm","sanjay");
 
		Carmodifying carmodifying=new Carmodifying();
		carmodifying.useCar(car);
		System.out.println(car.getBrand());
		
		car.display();
	}

}
