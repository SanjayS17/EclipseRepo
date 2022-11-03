package encapsulation.com.xworkz.boot;



import encapsulation.com.xworkz.Location;
import encapsulation.com.xworkz.Pg;

public class LocationRunner {

	public static void main(String[] args) {
		Location location=new Location();
		
		Pg pg=new Pg(100,"boys",1500.88,true,123.34f,"vrpg","red",120,"prakashnagar","venkat");
      
		
		location.usePg(pg);
		pg.display();
		System.out.println(pg.getownername1());
	}

}
