package inheritance2.com.things.boot;

import inheritance2.com.things.Centraljail;
import inheritance2.com.things.Jail;
import inheritance2.com.things.Othersjail;
import inheritance2.com.things.Womenjail;

public class JailRunner {

	public static void main(String[] args) {
		
		Jail jail=new Jail();
		System.out.println(jail.name);
		System.out.println(jail.jailno);
		System.out.println("*******************");
		
		Jail jail1=new Centraljail();
		Centraljail centraljail=(Centraljail)jail1;
		System.out.println(centraljail.place);
		System.out.println(centraljail.phoneno);
		System.out.println(centraljail.name);
		System.out.println(centraljail.jailno);
		System.out.println("&&&&&&&&&&&&&&&&&&&7");
		
		Jail jail2=new Womenjail();
		Womenjail womenjail=(Womenjail)jail2;
		System.out.println(womenjail.womennames);
		System.out.println(womenjail.noOfwomensinjail);
		System.out.println(womenjail.name);
		System.out.println(womenjail.jailno);
		System.out.println("####################");
		
		Jail jail3=new Othersjail();
		Othersjail Othersjail=(Othersjail)jail3;
		System.out.println(Othersjail.othersname);
		System.out.println(Othersjail.noOfothers);
		System.out.println(Othersjail.name);
		System.out.println(Othersjail.jailno);
		System.out.println("@@@@@@@@@@@@@@@");
		
	}

}
