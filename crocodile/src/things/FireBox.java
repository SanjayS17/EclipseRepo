
package things;

import org.springframework.stereotype.Component;



@Component
public class FireBox implements Browser {

	public FireBox() {
		System.out.println("by using default constructor....");
	}
	
	public void browser(){
		System.out.println("running browser firebox...");
		
	}

}
