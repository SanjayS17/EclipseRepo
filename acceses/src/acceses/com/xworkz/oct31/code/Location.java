package acceses.com.xworkz.oct31.code;

public class Location {
    public int number;
    public String Streetname;
    public City city=new City("bangalore","bangalore",100.7,30);
    public State state=new State("karnataka","karunadu","bomai",99048374);
    public Country country=new Country("india","dropadi","bangalore",354.53);
    
    
    public Location() 
    {
    	 
    }
    //
    public Location(int number,String Streetname) 
    {
    	
    	this.number=number;
    	this.Streetname=Streetname;
    	
    }
    //
    public void display()
    {
    	System.out.println(this.number);
    	System.out.println(this.Streetname);
    	System.out.println(city.name);
    	System.out.println(city.capitalCity);
    	System.out.println(city.areaInSquareKilometer);
    	System.out.println(city.number);
    	System.out.println(state.name);
    	System.out.println(state.oldName);
    	System.out.println(state.cmname);
    	System.out.println(state.noofpeople);
    	System.out.println(country.name);
    	System.out.println(country.Presidentname);
    	System.out.println(country.Cityname);
    	System.out.println(country.areaInSquareKilometer);
    }
    //
    
}
