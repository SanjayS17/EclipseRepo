package classs.com.boot;

import classs.com.WaterBottle;

public class WaterBottleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WaterBottle waterBottle=new WaterBottle("bisleri","white",1,12.3,"waterbottle",true,true,2022,2023,true);
         System.out.println(waterBottle);
         
         WaterBottle waterBottle1=new WaterBottle("bisley","blue",2,13.3,"waterbottle",false,true,2022,2023,false);
         System.out.println(waterBottle1);
         
         waterBottle=waterBottle1;
         boolean bottle=waterBottle.equals(waterBottle1);
         System.out.println(bottle);
         
		
	}

}

