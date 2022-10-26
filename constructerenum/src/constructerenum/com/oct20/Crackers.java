package constructerenum.com.oct20;

import constructerenum.com.xworkz.CrackersType;

public class Crackers {

	//name,price,quantity,color,shopname
	public  static String name="arun";//Literal type
	public double price;
	public String shopname;
	public boolean quality;
	public CrackersType crackersType=CrackersType.LAKSHMI;//enum type
	
	public Crackers( boolean quality) {
	 
	 this.quality=quality;
	 System.out.println("creating by cracke... file..");
	 //by using constructor
	}
	
	public void setPrice(double price) 
	{
		this.price=price;//
	//by using method	
	}
	 public  void display() {
		 System.out.println(Crackers.name);
		 System.out.println(this.price);
		 System.out.println(this.shopname);
		 System.out.println(this.quality);
		 System.out.println(this.crackersType.LAKSHMI); 	 
	 }
	 //display type
	 static  {
		 name="arun"; 
	 }
	//static block
}
