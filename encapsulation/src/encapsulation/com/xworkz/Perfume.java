package encapsulation.com.xworkz;

public class Perfume {

	private String brand="cobra";
	String fragrance;
	double price;
	String ambassador;
	float weight;
	String name;
	String color;
	private String shopname="venkat";
	int shopnumber;
	String shoplocation;
	String ownername;
	
	public Perfume() 
	{
		
	}
	//
	public String getBrand()
	{
		return this.brand;
	}
	//
	public String getShopname() 
	{
		return this.shopname; 
	}
	//
	void setBrand(String brand) {
		this.brand=brand;
	}
	//
	public void setShopname(String shopname) {
		this.shopname=shopname;
	}
	//
	public Perfume(String fragrance,double price,String ambassador,float weight,String name,String color,
			int shopnumber,	String shoplocation,String ownername)
	{
		super();
		this.fragrance=fragrance;
		this.price=price;
		this.ambassador=ambassador;
		this.weight=weight;
		this.name=name;
		this.color=color;
		this.shopnumber=shopnumber;
		this.ownername=ownername;
		this.shoplocation=shoplocation;
	}
	//
	public void display() 
	{
		System.out.println(this.fragrance);
		System.out.println(this.price);
		System.out.println(this.ambassador);
		System.out.println(this.weight);
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.shopnumber);
		System.out.println(this.ownername);
		System.out.println(this.shoplocation);
		
	}
	//
	
}
