package collection.xworkz.collectionmethods;

import java.util.ArrayList;
import java.util.List;

public class ListRunner {

	public static void main(String[] args) 
	{
	    List<String> list=new ArrayList<String>();
	    
	    list.add("R");	 
	    list.add("Y");
	    list.add("U");
	    list.add("S");
		
	    list.add(2,"E");
	    System.out.println(list);
	    
	   /* for(String string:list)
	    {
	    	System.out.println(string);
	    }*/
	    System.out.println("-----------------------");
	    
	    list.set(3, "A");
	    System.out.println(list);
	   /* for(String string:list)
	    {
	    	System.out.println(string);
	    }*/
	    System.out.println("------------remove---------");
	    
	    list.remove("R");//yeas
	    System.out.println(list);
	    
	    list.set(2,"O");//yeos
	    System.out.println(list);
	    
	    String ref=list.get(2);
	    System.out.println(ref);
	    
	    

		
	}

}
