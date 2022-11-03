package encapsulation.com.xworkz;

public class Watchmodifyier {

	
	Watch watch;
	public void useWatch(Watch watch) {
		System.out.println(watch.getBrand());
		watch.setBrand("oneplus");
		System.out.println("after modifyien the watch");
		
		
	}
	
	
}
