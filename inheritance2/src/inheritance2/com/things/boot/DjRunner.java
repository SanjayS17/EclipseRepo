package inheritance2.com.things.boot;

import inheritance2.com.things.things4.DjParty;

public class DjRunner {

	public static void main(String[] args) {
		
		DjParty djParty=new DjParty("vrdj",12,12334);
		System.out.println(djParty.djName);
		System.out.println(djParty.noOfdjs);
		System.out.println(djParty.price);
		
		

	}

}
