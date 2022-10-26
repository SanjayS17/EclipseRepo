
package constructerenum.com.oct20;
import constructerenum.com.oct20.Crackers;

public class CrackersRunner {

	public static void main(String[] args) {
	
		Crackers crackers=new Crackers(true);
		crackers.setPrice(20);
		// 
		crackers.shopname="natraj";
		//by using reference  
		crackers.display() ;
		
	}

}
