package encapsulation.com.xworkz.boot;

import encapsulation.com.xworkz.things.Bag;
import encapsulation.com.xworkz.things.Bagmodifying;

public class BagRunner {

	public static void main(String[] args) {
		
	Bag bag=new Bag("lether",120,"kohli",12.34f,"bags","red","arun",123,"vvpura","natraj");
	
	Bagmodifying  ttt=new Bagmodifying();
	ttt.useBAg(bag);
	System.out.println(bag.getBrand());
	
       bag.display();
       
	}

}
