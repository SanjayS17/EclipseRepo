package com.xworkz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MaxMinRunner {

	public static void main(String[] args) {

		Collection<Integer> collection=new ArrayList<Integer>();
		
		collection.add(45);
		collection.add(333);
		collection.add(76);
		collection.add(29);
		collection.add(900);
		collection.add(23);
		collection.add(474);
		collection.add(654);
		collection.add(29);
		collection.add(454);
		
		System.out.println("max "+Collections.max(collection));
		System.out.println("min "+Collections.min(collection));
		
		
	}

}
