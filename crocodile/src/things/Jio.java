package things;

import org.springframework.stereotype.Component;



@Component
public class Jio implements Provider {

	public Jio() {
System.out.println("by using super constructor....");
	
	}
	
	public void connect() {
		System.out.println("running connector in jio....");
	}
	

}
