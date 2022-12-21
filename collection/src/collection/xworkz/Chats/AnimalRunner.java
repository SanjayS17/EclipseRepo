package collection.xworkz.Chats;

import java.util.Iterator;
import java.util.LinkedList;

public class AnimalRunner {

	public static void main(String[] args) {

		String ani="dog";
		String ani1="cat";
		String ani2="elephant";
		String ani3="lion";
		String ani4="tiger";
		String ani5="deer";
		String ani6="goat";
		String ani7="buffelo";
		String ani8="horse";
		String ani9="fox";
		
		LinkedList<String> list=new LinkedList();
		
		list.add(ani);
		list.add(ani1);
		list.add(ani2);
		list.add(ani3);
		list.add(ani4);
		list.add(ani5);
		list.add(ani6);
		list.add(ani7);
		list.add(ani8);
		list.add(ani9);
		
		System.out.println(list.size());
		System.out.println(list);
		
		System.out.println("accessing all the elements from collection...");
		
		//for each
		for(String element:list)
		{
			System.out.println(element);
		}
		
		System.out.println("=========Iteratar==================");
		
		Iterator<String> element=list.iterator();
		
		//while
		while(element.hasNext())
		{
			String element1=element.next();
			System.out.println(element1);
		}
		
		
	}

}
