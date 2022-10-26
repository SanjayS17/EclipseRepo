package constructermethods.com.oct24;

import constructermethods.enumfile.Shirtcolor;

public class ShirtBrand {

	public String name;
	public int price;
	public String brand;
	public static String type ="fullsleve";
	public Shirtcolor shirtcolor=Shirtcolor.RED;
	
	
	public ShirtBrand(String name) {
           this.name=name;
	}
	public void setprice(int price) {
		this.price=price;
	}
	public void display() {
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.brand);
		System.out.println(ShirtBrand.type);
		System.out.println(shirtcolor.RED);
	}
	static {
		type="fullsleve";
	}
}
