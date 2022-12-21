package collection.xworkz.Chats;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class ChatsRunner {

	public static void main(String[] args) {

		
		String chat="masalapuri";
		String chat1="vadapav";
		String chat2="panipuri";
		String chat3="gobi";
		String chat4="sevpuri";
		
		Collection<String> collection=new TreeSet();
		
		collection.add(chat4);
		collection.add(chat3);
		collection.add(chat2);
		collection.add(chat1);
		collection.add(chat);
		//collection.add(chat);
		collection.add("nippatmasala");
		
		System.out.println(collection.size());
		System.out.println(collection);
		
		System.out.println("accessing all elements from collection...");
		
		//for each 
		for(String element:collection)
		{
		 System.out.println(element);	
		}
		
		System.out.println("=========Iterater==========");
		
		Iterator<String> ref=collection.iterator();
		
		while(ref.hasNext()) 
		{
		   String element=ref.next();
		   System.out.println(element);
		}
		
		
	}

}
