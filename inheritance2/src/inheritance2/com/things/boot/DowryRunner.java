package inheritance2.com.things.boot;

import inheritance2.com.things.things4.DowryMoney;

public class DowryRunner {

	public static void main(String[] args) {
		
		DowryMoney dowryMoney=new  DowryMoney("xy",200000,"z");
		System.out.println(dowryMoney.donor);
		System.out.println(dowryMoney.price);
		System.out.println(dowryMoney.receiver);
		
	}

}
