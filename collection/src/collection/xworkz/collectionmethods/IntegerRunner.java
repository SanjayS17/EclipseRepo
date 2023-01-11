package collection.xworkz.collectionmethods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class IntegerRunner {

	public static void main(String[] args) {

		List<Integer> collection=new ArrayList<Integer>();
		collection.add(100);
		collection.add(200);
		collection.add(300);
		collection.add(400);
		
		collection.set(0,200);
		System.out.println(collection);
		
		collection.remove(3);
		System.out.println(collection);
		
		collection.removeAll(collection);
		System.out.println(collection);
		
		collection.set(2,100);
		System.out.println(collection);
		
		
	}

}
