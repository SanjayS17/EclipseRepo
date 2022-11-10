package inheritance2.com.things.things4;

public class Dj {
	public String djName;
	public int noOfdjs;
	public long price;
	
	
	public Dj() {
	System.out.println("creating default constructor of dj class");
	
	}
	public Dj(String djName, int noOfdjs, long price) {
		super();
		this.djName = djName;
		this.noOfdjs = noOfdjs;
		this.price = price;
		System.out.println("creating parameterised constructor of dj class");
		
	}
	
	
	

}
