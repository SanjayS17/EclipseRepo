package things;

import org.springframework.stereotype.Component;



@Component
public class Chrome implements Browser {

	public Chrome() {
            System.out.println("create chrome by using default constructor....");
	}
	
	public void browser(){
		System.out.println("running browser in chrome...");
		
	}

	
}
