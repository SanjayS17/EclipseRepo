package inheritance2.com.things.thinks5;

public class Prashanth  extends Director{
	
	public String moviename;
	public Prashanth(String name, int age) {
		super(name, age);
		
	}
	public Prashanth(String name, int age,String moviename) {
	this( name,age);
     this.moviename=moviename;
	
	}
	public void display() {
		super.display();
		System.out.println(moviename);
	}
	
	
	

}
