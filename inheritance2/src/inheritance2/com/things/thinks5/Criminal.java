package inheritance2.com.things.thinks5;

public class Criminal {
	public String name;
	public  String type;
	
	
	public Criminal(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	
	public void display() {
		System.out.println(this.name);
		System.out.println(this.type);
		
	}
	

}
