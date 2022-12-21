package collection.xworkz.Chats;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class SoftWareCompanyNamesRunner {

	public static void main(String[] args) {

		String name="microsoft";
		String name1="wipro";
		String name2="tata";
		String name3="infosys";
		String name4="google";
		String name5="convergys";
		String name6="verizon";
		String name7="nokia";
		String name8="deloitte";
		String name9="dell";
		String name10="capmark";
		String name11="honeywell";
		String name12="kanbay";
		String name13="infotec";
		String name14="ncr";
		String name15="motorola";
		String name16="htmt";
		String name17="qualcomm";
		String name18="cordys";
		String name19="countrywide";
		
		Collection<String> collection=new TreeSet();
		
		collection.add(name);
		collection.add(name1);
		collection.add(name2);
		collection.add(name3);
		collection.add(name4);
		collection.add(name5);
		collection.add(name6);
		collection.add(name7);
		collection.add(name8);
		collection.add(name9);
		collection.add(name10);
		collection.add(name11);
		collection.add(name12);
		collection.add(name13);
		collection.add(name14);
		collection.add(name15);
		collection.add(name16);
		collection.add(name17);
		collection.add(name18);
		collection.add(name19);
		
		System.out.println(collection.size());
		System.out.println(collection);
		
		System.out.println("access all the element throw  the collection....");
		
		//for each
		for(String element:collection)
		{
			System.out.println(element);
		}
		
		System.out.println("============Iteratar=====================");
		
		Iterator<String> ref=collection.iterator();
		while(ref.hasNext())
		{
			String element=ref.next();
			System.out.println(element);
			
		}
	}

}
