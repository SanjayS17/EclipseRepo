package encapsulation.com.xworkz;

public class Watch {

	private String brand="boat";
	String type ;
	double price;
	String ambassador;
	float weight;
	String name;
	String color;
    String shopname;
	int shopnumber;
	String shoplocation;
	String ownername;
	public Watch( String type, double price, String ambassador, float weight, String name, String color,
			String shopname, int shopnumber, String shoplocation, String ownername) {
		super();
		//this.brand = brand;
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
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
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
