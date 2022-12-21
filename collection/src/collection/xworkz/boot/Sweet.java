package collection.xworkz.boot;

import java.util.Collection;
import java.util.TreeSet;

public class Sweet {

	public static void main(String[] args) {

		String sweet="laddu";
		String sweet1="jamoon";
		String sweet2="almond torte";
		String sweet3="creme brulee";
		String sweet4="brownie sundae";
		String sweet5="baked alaska";
		String sweet6="cream puffs";
		String sweet7="cheesecake";
		String sweet8="cherries jubilee";
		String sweet9="tiramisu";
		String sweet10="poached pears";
		String sweet11="chocolate souffle";
		String sweet12="croquembouche";
		
		Collection<String> collection=new TreeSet();
		collection.add(sweet);
		collection.add(sweet1);
		collection.add(sweet2);
		collection.add(sweet3);
		collection.add(sweet4);
		collection.add(sweet5);
		collection.add(sweet6);
		collection.add(sweet7);
		collection.add(sweet8);
		collection.add(sweet9);
		collection.add(sweet10);
		collection.add(sweet11);
		collection.add(sweet12);
		
		System.out.println(collection.size());
		collection.clear();
		System.out.println("after clear...");
		
	}

}

