package constructermethods.com.oct24;

import constructermethods.enumfile.Lampshape;

public class Lamp {
   public String name;
   public int price;
   public double weight;
   public static float height=12.55f;
   public Lampshape lampshape=Lampshape.ROUND;
   
   public Lamp(String name) {
	   this.name=name;
   }
   //
   public void setWeight(double weight) {
	   this.weight=weight;
   }
   //
   public void display() {
	   System.out.println(this.name);
	   System.out.println(this.price);
	   System.out.println(this.weight);
	   System.out.println(Lamp.height);
	   System.out.println( lampshape.ROUND);
   }
       static {
    	   height=12.55f;
       }
	   
   
}
