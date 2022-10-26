package constructermethods.com.oct24.boot;

import constructermethods.com.oct24.Flower;

public class FlowerRunner {

	public static void main(String[] args) {
		
		
       Flower flower=new Flower("flower");
   
       flower.setPrice(50);
       
       flower.quality=(true);
       
       flower.display();
	}

}
