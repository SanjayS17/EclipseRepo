package encapsulation.com.xworkz.boot;

import encapsulation.com.xworkz.things.SpaceStation;
import encapsulation.com.xworkz.things.Station;

public class SpaceStationRunner {

	public static void main(String[] args) {
	
		SpaceStation rt=new SpaceStation("iss","usa",4,456,"neil armstrong",true,"falcon",9.8,58,"nasa");
		//
          Station station=new Station();
          station.useSpaceStation(rt);
		//
	     rt.display();
	     System.out.println(rt.getweight());
	     
	     
	}
}
