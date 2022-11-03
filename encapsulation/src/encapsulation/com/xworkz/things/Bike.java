package encapsulation.com.xworkz.things;

public class Bike {

	private String brand="tvs";
	String type ;
	double price;
	String ambassador;
	float weight;
	String name;
	String color;
	private String shopname="venkat";
	int shopnumber;
	String shoplocation;
	String ownername;
	public Bike( String type, double price, String ambassador, float weight, String name, String color,
			 int shopnumber, String shoplocation, String ownername) {
		super();
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.ambassador = ambassador;
		this.weight = weight;
		this.name = name;
		this.color = color;
		this.shopname = shopname;
		this.shopnumber = shopnumber;
		this.shoplocation = shoplocation;
		this.ownername = ownername;
	}
	
	public String getBrand() {
		return brand=brand;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getshopname() {
		return shopname=shopname;
	}
	public void setshopname(String shopname) {
		this.shopname=shopname;
	}
	public void display() {
		System.out.println(this.type);
		System.out.println(this.ambassador);
		System.out.println(this.price);
		System.out.println(this.weight);
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.shopnumber);
		System.out.println(this.shoplocation);
		System.out.println(this.ownername);
		System.out.println(this.brand);
		System.out.println(this.shopname);
		
	}
}
