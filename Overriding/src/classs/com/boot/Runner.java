package classs.com.boot;

import classs.com.Currency;
import classs.com.God;
import classs.com.Institution;
import classs.com.LipStick;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
               Currency currency=new Currency("rupai","rbi","india","rbi",12,"sandpaper","fakenote","yellow",23.77,3455f);
               System.out.println(currency);
               
               Currency currency1=new Currency("rupai","rbi","india","rbi",12,"sandpaper","fakenote","yellow",23.77,3455f);
               System.out.println(currency1);
               
               boolean note=currency.equals(currency1);
               System.out.println(note);
               System.out.println("///////////////");
               
               God god=new God("shiva","male","natraj","murdeshvara","shivatemple",100,true,100,200,true);
               System.out.println(god);
               
               God god1=new God("shiva","male","natraj","murdeshvara","shivatemple",100,true,100,200,true);
               System.out.println(god1);
               
               boolean deva =god.equals(god1);
               System.out.println(deva);
               System.out.println("..............");
               
               Institution institution=new Institution("kvs","prasanna","dvg","natraj","dvg","nagraj",1990,12000.55,99560438,577345);
               System.out.println(institution);
               

               Institution institution1=new Institution("kvs","prasanna","dvg","natraj","dvg","nagraj",1990,12000.55,99560438,577345);
               System.out.println(institution1);
               
               boolean school=institution.equals(institution1);
               System.out.println(school);
               System.out.println(";;;;;;;;;;;;");
               
               LipStick lipstick=new LipStick("lipstick","transparent","lipbalm","goodfinish","red","india","Smashbox","more",100.34,100);
               System.out.println(lipstick);
               

               LipStick lipstick1=new LipStick("lipstick","transparent","lipbalm","goodfinish","red","india","Smashbox","more",100.34,100);
               System.out.println( lipstick1);
               
              boolean lip=lipstick.equals(lipstick1);
              System.out.println(lip);
               
	}

}
