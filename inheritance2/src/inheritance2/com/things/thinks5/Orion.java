package inheritance2.com.things.thinks5;

public class Orion extends ShoppingMall {
	
	private Object ownerName;
	public Orion(String name, String location, Object ownerName) {
		super(name, location);
		this.ownerName=ownerName;
	}
	public  void display() {
		super.display();
		System.out.println(ownerName);	
	}
}
