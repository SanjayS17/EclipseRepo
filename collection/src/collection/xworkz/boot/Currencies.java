package collection.xworkz.boot;

import java.util.TreeSet;

public class Currencies {

	public static void main(String[] args) {

		String Currency="cincuenta";
		String Currency1="rupes";
		String Currency2="afghani";
		String Currency3="lek";
		String Currency4="diner";
		String Currency5="peso";
		String Currency6="taka";
		String Currency7="euro";
		String Currency8="real";
		String Currency9="ringgit";
		String Currency10="leva";
		String Currency11="new riel";
		String Currency12="yuan renminbi";
		String Currency13="peso";
		String Currency14="franc";
		String Currency15="kuna";
		String Currency16="euro1";
		String Currency17="doller1";
		String Currency18="koruna";
		String Currency19="doller2";
		String Currency20="krone";
		String Currency21="pound";
		String Currency22="kroon";
		String Currency23="birr";
		String Currency24="doller3";
		String Currency25="doller4";
		
		TreeSet<String> tree=new TreeSet();
		tree.add(Currency);
		tree.add(Currency1);
		tree.add(Currency2);
		tree.add(Currency3);
		tree.add(Currency4);
		tree.add(Currency5);
		tree.add(Currency6);
		tree.add(Currency7);
		tree.add(Currency8);
		tree.add(Currency9);
		tree.add(Currency10);
		tree.add(Currency11);
		tree.add(Currency12);
		tree.add(Currency13);
		tree.add(Currency14);
		tree.add(Currency15);
		tree.add(Currency16);
		tree.add(Currency17);
		tree.add(Currency18);
		tree.add(Currency19);
		tree.add(Currency20);
		tree.add(Currency21);
		tree.add(Currency22);
		tree.add(Currency23);
		tree.add(Currency24);
		tree.add(Currency25);
		
		System.out.println(tree.size());
		
		tree.clear();
		System.out.println("after  clear ....");
		
	}

}
