package encapsulation.com.xworkz.things;

public class Station {

	SpaceStation spaceStation;
	
	public void useSpaceStation(SpaceStation spaceStation) {
		System.out.println(spaceStation.getweight());
		spaceStation.setWeight(123.4);
		//
		System.out.println(spaceStation.getweight());
		
		
	}
}
