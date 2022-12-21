package collection.xworkz.Chats;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MetroCityNamesRunner {

	public static void main(String[] args) {

		String metro="srirampura";
		String metro1="kuvempumetro";
		String metro2="sandalsoap";
		String metro3="mejastic";
		String metro4="yashwanthpura";
		
		Collection<String> collection=new ArrayList();
		
		collection.add(metro);
		collection.add(metro1);
		collection.add(metro2);
		collection.add(metro3);
		collection.add(metro4);
		
		System.out.println(collection.size());
		System.out.println(collection);
		
		System.out.println("accessing the all the elements throw collection....");
		
		//for each
		for(String element:collection)
		{
			System.out.println(element);
		}
		
		System.out.println("=============Iteratar===================");
		
		//while
		Iterator<String> city=collection.iterator();
		
		
		while(city.hasNext())
		{
			String element=city.next();
			System.out.println(element);
		}
		
	}

}
