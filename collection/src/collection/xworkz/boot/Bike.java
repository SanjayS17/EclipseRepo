package collection.xworkz.boot;

import java.util.TreeSet;

public class Bike {

	public static void main(String[] args) {

		String bike="xl";
		String bike1 = "Royal Enfield Bullet";
		String bike2 = "Royal Enfield classic";
		String bike3 = " TVS ";
		String bike4 = "TVS Apache";
		String bike5 = "Honda Shine";
		String bike6 = "Bajaj Platina";
		String bike7 = "Pulsar ";
		String bike8 = "Hero splender plus";
		String bike9 = "Yamaha";
		String bike10 = "ronin";
		String bike11 = "Dio";
		String bike12 = "Delux";
		String bike13 = "Royal enfield Meteor";
		String bike14 = "Royal enfield Himalayan";
		String bike15 = "JVS Jupiter";
		String bike16 = "Yamaha MT";
		String bike17 = "KTM Duke";
		String bike18 = "Honda Activa";
		
		TreeSet<String> treeset=new TreeSet();
		
		treeset.add(bike);
		treeset.add(bike1);	
		treeset.add(bike2);
		treeset.add(bike3);	
		treeset.add(bike4);
		treeset.add(bike5);
		treeset.add(bike6);
		treeset.add(bike7);
		treeset.add(bike8);
		treeset.add(bike9);
		treeset.add(bike10);
		treeset.add(bike11);
		treeset.add(bike12);
		treeset.add(bike13);
		treeset.add(bike14);
		treeset.add(bike15);
		treeset.add(bike16);
		treeset.add(bike17);
		treeset.add(bike18);
		
		System.out.println(treeset.size());
		treeset.clear();
		System.out.println("after clear.....");
		
		
	}

}
