package stream;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class WeaponDTORunner {

	public static void main(String[] args) {

     Collection<WeaponDTO> collection=new LinkedList<WeaponDTO>();
     collection.add(new WeaponDTO("AKM", "India", "1989", 20000d, Type.AssualtRifles));
		collection.add(new WeaponDTO("M16A4", "Russia", "1978", 3000d, Type.AssualtRifles));
		collection.add(new WeaponDTO("M416", "USA", "1958", 5000d, Type.AssualtRifles));
		collection.add(new WeaponDTO("Groza", "UK", "1966", 9000d, Type.AssualtRifles));
		collection.add(new WeaponDTO("AUG A3", "India", "1999", 3500d, Type.AssualtRifles));
		collection.add(new WeaponDTO("Kar98", "Russia", "1925", 9500d, Type.Sniper));
		collection.add(new WeaponDTO("M24", "Japan", "1975", 23000d, Type.Sniper));
		collection.add(new WeaponDTO("AWM", "USA", "1973", 25000d, Type.Sniper));
		collection.add(new WeaponDTO("Win98", "India", "1922", 1000d, Type.Sniper));
		collection.add(new WeaponDTO("UZI", "Japan", "1955", 12000d, Type.submachine));
		collection.add(new WeaponDTO("UMP45", "China", "1952", 8000d, Type.submachine));
		collection.add(new WeaponDTO("Vector", "Russia", "1997", 5000d, Type.submachine));
		collection.add(new WeaponDTO("Thompson", "Australia", "1909", 3500d, Type.submachine));
		collection.add(new WeaponDTO("Bizon", "Japan", "1922", 2000d, Type.submachine));
		collection.add(new WeaponDTO("S686", "India", "1954", 6000d, Type.shootgun));
		collection.add(new WeaponDTO("S1897", "China", "1965",5800d, Type.shootgun));
		collection.add(new WeaponDTO("S12K", "Australia", "1985", 4500d, Type.shootgun));
		collection.add(new WeaponDTO("DBS", "India", "1954", 5000d, Type.shootgun));
		collection.add(new WeaponDTO("Skorpion", "India", "2000", 1000d, Type.pistool));
		collection.add(new WeaponDTO("Pan", "UK", "1999", 500d, Type.melee));
		
		System.out.println("sort by price in greater");
		Comparator<WeaponDTO> ref=(a1,a2)->Double.compare(a1.getPrice(), a2.getPrice());
		collection.stream().sorted(ref).collect(Collectors.toList()).forEach(ele->System.out.println(ele));
		

		System.out.println("Sort by madeBy and madeOn");
		collection.stream().sorted((a1,a2)->a1.getMadeBy().compareTo(a2.getMadeBy())).sorted((a1,a2)->a1.getMadeOn().compareTo(a2.getMadeOn())).forEach(ele->System.out.println(ele));
		
		System.out.println("Sort by name in descending");
		collection.stream().sorted((a1,a2)->a2.getName().compareTo(a1.getName())).forEach(ele->System.out.println(ele));
		
		System.out.println("Sort by MadeBy");
		collection.stream().sorted((a1,a2)->a1.getMadeBy().compareTo(a2.getMadeBy())).forEach(ele->System.out.println(ele));
		
		System.out.println("Sort by MadeOn");
		collection.stream().sorted((a1,a2)->a1.getMadeOn().compareTo(a2.getMadeOn())).forEach(ele->System.out.println(ele));
		
		System.out.println("Sort by price");
		collection.stream().sorted((a1,a2)->Double.compare(a1.getPrice(), a2.getPrice())).forEach(ele->System.out.println(ele));

		System.out.println("Sort by price descending");
		collection.stream().sorted((a1,a2)->Double.compare(a2.getPrice(), a1.getPrice())).forEach(ele->System.out.println(ele));
		
		System.out.println("Sort by name and madeOn");
		collection.stream().sorted((a1,a2)->a1.getName().compareTo(a2.getName())).sorted((a1,a2)->a1.getMadeOn().compareTo(a2.getMadeOn())).forEach(ele->System.out.println(ele));
		
		System.out.println("Sort by type,madeBy and name in descending");
		collection.stream().sorted((a1,a2)->a2.getType().compareTo(a1.getType())).sorted((a1,a2)->a2.getMadeBy().compareTo(a1.getMadeBy())).sorted((a1,a2)->a2.getName().compareTo(a1.getName())).forEach(ele->System.out.println(ele));

     

	}

}
