package constructermethods.com.oct24;

import constructermethods.enumfile.Saloontype;

public class Saloon {

	public String name;
	public int price;
	public String place;
	public static String coustomersname="arun";
	public Saloontype saloontype=Saloontype.GIRISH;
	
	
	public Saloon(String name) {
		this.name=name;
	}
	//
	public void setPrice( int price) {
		this.price=price;
	}
	public void  display() {
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.place);
		System.out.println(Saloon.coustomersname);
		System.out.println(saloontype.GIRISH);
	}
	static {
		coustomersname="arun";
	}
}
