package constructermethods.com.oct24.boot;

import constructermethods.com.oct24.ShirtBrand;

public class ShirtBrandRunner {

	public static void main(String[] args) {
		
		ShirtBrand shirtBrand=new ShirtBrand("levis");
		
		shirtBrand.setprice(30);
		
		shirtBrand.brand="puma";
		
		shirtBrand.display();
	}

}
