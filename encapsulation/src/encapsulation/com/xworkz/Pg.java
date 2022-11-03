package encapsulation.com.xworkz;

public class Pg {


	private int noofpeople;
	String type;
	double price;
	boolean pgclean;
	float weight;
	String name;
	String color;
	private String ownername1="venkat";
	int pgnumber;
	String pglocation;
	String ownername;
	
	
	
	public Pg(int noofpeople, String type, double price, boolean pgclean, float weight, String name, String color,
			 int pgnumber, String pglocation, String ownername)
	{
		super();
		this.noofpeople = noofpeople;
		this.type = type;
		this.price = price;
		this.pgclean = pgclean;
		this.weight = weight;
		this.name = name;
		this.color = color;
		this.pgnumber = pgnumber;
		this.pglocation = pglocation;
		this.ownername = ownername;
	}
	//
	
	public Pg() {
		
	}
	
	public String getownername1() {
		return ownername1=ownername1;
	}
	//
	public void setownername1(String ownername) {
		this.ownername1=ownername1;
	}
	//
	public void display() {
		System.out.println(this.color);
		System.out.println(this.noofpeople);
		System.out.println(this.type);
		System.out.println(this.price);
		System.out.println(this.pgclean);
		System.out.println(this.weight);
		System.out.println(this.name);
		System.out.println(this.pgnumber);
		System.out.println(this.pglocation);
		System.out.println(this.ownername);
		
		
	}
	
	
}
