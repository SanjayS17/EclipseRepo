package inheritance2.com.things.thinks5;

public class ShoppingMall {
	
  public String name;
  public String Location;
  
  
    public ShoppingMall(String name, String location) {
	super();
	this.name = name;
	Location = location;
	
}
    public void display() {
    	System.out.println(this.name);
    	System.out.println(this.Location);
    	
    	
    }
  
  

}
