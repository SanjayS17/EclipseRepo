package encapsulation.com.xworkz;

public class Carmodifying {

	Car car;
	public void useCar(Car car) {
		
		System.out.println(car.getBrand());
		car.setBrand("honda");
		System.out.println("after modifying car");
		
	}
}
