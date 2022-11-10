package inheritance2.com.things.thinks5;

public class Ravi extends Criminal {

	public int experience;
	   
	public Ravi(String name, String type) {
		super(name, type);
	
	}
	public Ravi(String name, String type,int experience ) {
	
		this(name, type);
		this.experience=experience;
		
	}
	public void display() {
		super.display();
		System.out.println(experience);
		
	}
	
	

}
