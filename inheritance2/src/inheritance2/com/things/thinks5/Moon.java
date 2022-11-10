package inheritance2.com.things.thinks5;

public class Moon extends Satellite{

	public String name2;
	public Moon(String name, int no) {
		super(name, no);
		
	}
	public Moon(String name, int no,String name2) {
		this(name, no);
		this.name2=name2;
	}
	public void display() {
		super.display();
		System.out.println(name2);
		
	}
	

}
