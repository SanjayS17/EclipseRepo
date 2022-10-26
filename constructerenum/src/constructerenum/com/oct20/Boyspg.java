package constructerenum.com.oct20;

import constructerenum.com.xworkz.Typepg;

public class Boyspg {
  
	public String name;
	public int price;
	public boolean comfertable;
	public String color;
	public Typepg typepg=Typepg.ONE;
	

public Boyspg(String name,int price,boolean comfertable,String color,Typepg typepg) {
	
	this.name=name;
	this.price=price;
	this.comfertable=comfertable;
	this.color=color;
	this.typepg=typepg;
	System.out.println("constra... creat ");
}
    public  void display() {
    
    	System.out.println(this.name);
    	System.out.println(this.price);
    	System.out.println(this.comfertable);
    	System.out.println(this.color);
    	System.out.println(this.typepg.ONE.value);
    	
    	
    }
}