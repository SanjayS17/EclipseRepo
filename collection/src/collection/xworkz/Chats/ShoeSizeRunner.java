package collection.xworkz.Chats;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ShoeSizeRunner {

	public static void main(String[] args) {

		int shoe=1;
		int shoe1=2;
		int shoe2=3;
		int shoe3=4;
		int shoe4=5;
		int shoe5=6;
		int shoe6=7;
		int shoe7=8;
		int shoe8=9;
		int shoe9=10;
		int shoe10=11;
		int shoe11=12;
		int shoe12=13;
		int shoe13=14;
		int shoe14=15;
		
		LinkedHashSet<Integer> has=new LinkedHashSet();
		
		has.add(shoe);
		has.add(shoe1);
		has.add(shoe2);
		has.add(shoe3);
		has.add(shoe4);
		has.add(shoe5);
		has.add(shoe6);
		has.add(shoe7);
		has.add(shoe8);
		has.add(shoe9);
		has.add(shoe10);
		has.add(shoe11);
		has.add(shoe12);
		has.add(shoe13);
		has.add(shoe14);
		
		System.out.println(has.size());
		System.out.println(has);
		
		System.out.println("accessing the elements throw collection..");
		
		//for each
		
		for(Integer element:has)
		{
			System.out.println(element);
		}
		
		System.out.println("============Iteratar====================");
		
		Iterator<Integer> integer=has.iterator();
		
		while(integer.hasNext())
		{
			Integer element=integer.next();
			System.out.println(element);
		}
		
		
		
		
		
	}

}
