package encapsulation.com.xworkz.boot;

import encapsulation.com.xworkz.things.StockAccess;
import encapsulation.com.xworkz.things.Stockmarket;

public class Stockrunner {

	public static void main(String[] args) {
		

			Stockmarket mar = new Stockmarket();
			StockAccess acc = new StockAccess();
			
			System.out.println(mar. getName());
			System.out.println(mar. getNoOfInvest());
			System.out.println(mar. getCompany());
			System.out.println(mar. getNoOfYears());
			System.out.println(mar. isProfit());
			System.out.println(mar. getRating());
			System.out.println(mar. getOwner());
			System.out.println(mar. getPresentRate());
			System.out.println(mar. getInterFace());
			System.out.println(mar. getSpeed());
			System.out.println(mar. getTiming());
			
			
			System.out.println(System.lineSeparator());
			
			acc.bear(mar);
	}

}
