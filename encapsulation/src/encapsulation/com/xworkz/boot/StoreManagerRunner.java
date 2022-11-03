package encapsulation.com.xworkz.boot;

import encapsulation.com.xworkz.Perfume;
import encapsulation.com.xworkz.StoreManager;

public class StoreManagerRunner {

	public static void main(String[] args) {
		
		StoreManager storeManager=new StoreManager();
		
		Perfume perfume=new Perfume("villain",123.3,"str",100.65f,"natraj","white",1,"rajajinagar","arun");
		perfume.display();
		storeManager.usePerfume(perfume);
		//
		storeManager.usePerfume(perfume);
		//
	
	

	}

}
