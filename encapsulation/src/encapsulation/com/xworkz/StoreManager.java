package encapsulation.com.xworkz;


public class StoreManager {
	Perfume perfume;
	public void usePerfume(Perfume perfume) {
		
		System.out.println(perfume.getBrand());
		perfume.setBrand("fogg");
		//
		System.out.println(perfume.getShopname());
		perfume.setShopname("arun");
	}
		
}




