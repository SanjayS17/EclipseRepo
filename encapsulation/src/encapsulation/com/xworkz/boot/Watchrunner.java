package encapsulation.com.xworkz.boot;

import encapsulation.com.xworkz.Watch;
import encapsulation.com.xworkz.Watchmodifyier;

public class Watchrunner {

	public static void main(String[] args) {

		Watch watch=new Watch("belt",1500,"kohli",12.34f,"crest","black","ganesh",123,"bengalore","sharath");
		
		Watchmodifyier aaa=new Watchmodifyier();
		aaa.useWatch(watch);
		watch.display();
		System.out.println(watch.getBrand());
		
	
		
	}

}
