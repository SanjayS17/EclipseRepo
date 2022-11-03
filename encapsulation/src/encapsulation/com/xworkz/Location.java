package encapsulation.com.xworkz;

public class Location {

	Pg pg;
	public void usePg(Pg pg) {
		
		System.out.println(pg.getownername1());
		pg.setownername1("arun");
		System.out.println(pg.getownername1());
		//
		System.out.println("after modifying the ownername1");
		
	}
}
