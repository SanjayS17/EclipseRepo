package constructermethods.com.oct24.boot;

import constructermethods.com.oct24.Saloon;

public class SaloonRunner {

	public static void main(String[] args) {
		
		Saloon saloon=new Saloon("ntr");
		saloon.place="bangalre";
		saloon.setPrice(30);
		
		saloon.display();
				
	}
}
