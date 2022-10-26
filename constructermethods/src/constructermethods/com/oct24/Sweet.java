package constructermethods.com.oct24;

import constructermethods.enumfile.Sweettype;

public class Sweet {

	public String name;
	public int price;
    public double quantity;
	public static String color="white";
	public Sweettype sweettype=Sweettype.JAMOON;
	
	public Sweet(String name) {
		this.name=name;
	}
	//by using constructor
	public void setPrice(int price) {
		this.price=price;
	}
	//by using method
	public void showoff() {
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.quantity);
		System.out.println(Sweet.color);
		System.out.println(sweettype.JAMOON);
	}
	//display 
	static {
		color="white";
	}
	//static block

}