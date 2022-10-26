package constructermethods.com.oct24;

import constructermethods.enumfile.Flowertype;

public class Flower {

	public String name;
	public int price;
	public boolean quality;
	public static  String color="red";
	public Flowertype flowertype=Flowertype.ROSE;
	
	public Flower( String name) {
		this.name=name;
	}
	//
	public void setprice(int price) {
		this.price=price;
	}
	//
	public void display() {
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.quality);
		System.out.println(Flower.color);
		System.out.println(flowertype.ROSE);
	}
	//
	static {
		color="red";
	}
	public void setPrice(int i) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
