package collection.xworkz.Chats;

import java.util.Iterator;
import java.util.TreeSet;

public class WatchRunner {

	public static void main(String[] args) {

		
		String watch="fastrack";
		String watch1="hmt";
		String watch2="boat";
		String watch3="sonata";
		String watch4="quartz";
		
		TreeSet<String> set=new TreeSet();
		
		set.add(watch3);
		set.add(watch2);
		set.add(watch1);
		set.add(watch4);
		set.add(watch);
		
		System.out.println(set.size());
		System.out.println(set);
		
		
		System.out.println("accessing all elements from collection...");
		
		//for each 
		for(String element:set)
		{
			System.out.println(element);
		}
		
		System.out.println("===========Iteratar==============");
		
		Iterator<String> reference=set.iterator();
		
		//while 
		while(reference.hasNext())
		{
			String element=reference.next();
			System.out.println(element);
		}
		
		
	}

}
