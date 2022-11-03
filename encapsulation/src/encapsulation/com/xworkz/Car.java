package encapsulation.com.xworkz;

public class Car {
	private String brand="duster";
	String type ;
	double price;
	String ambassador;
	float weight;
	String name;
	String color;
	//private String showroomname="shashi";
	int showroomno;
	String showroomlocation;
	String ownername;
	
	public Car( String type, double price, String ambassador, float weight, String name, String color,
			 int showroomno, String showroomlocation, String ownername)
	{
		super();
		//this.brand = brand;
		this.type = type;
		this.price = price;
		this.ambassador = ambassador;
		this.weight = weight;
		this.name = name;
		this.color = color;
		//this.showroomname = showroomname;
		this.showroomno = showroomno;
		this.showroomlocation = showroomlocation;
		this.ownername = ownername;
		
	}
	
	public String getBrand()
	{
		return brand=brand;
	}
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	 public void display() {
		 System.out.println(this.type);
		 System.out.println(this.price);
		 System.out.println(this.ambassador);
		 System.out.println(this.weight);
		 System.out.println(this.name);
		 System.out.println(this.color);
		 System.out.println(this.showroomno);
		 System.out.println(this.showroomlocation);
		 System.out.println(this.ownername);
	 }
	
	
	
}
