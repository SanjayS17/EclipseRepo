package encapsulation.com.xworkz.things;

public class SpaceStation {

	public String name;
	private double weight=235.2;
	public String country;
	public int noOfdocking;
	public int habitaleVolume;
	public String astronauts;
	public boolean morePower;
	public String spaceCraftName;
	public double gravity;
	public int length;
	public String organisation;
	
	public SpaceStation()
	{
		
	}
	//
	public  double getweight()
	{
		return weight;
		
	}
	//
	 public void setWeight(double weight)
	{
		this.weight=weight;
	}
	//
	public  SpaceStation(String name,String country,int noOfdocking,int habitaleVolume,String astronauts,
			boolean morePower,	String spaceCraftName, double gravity, int length,String organisation)
	{
		super();
		this.name=name;
		this.country=country;
		this.noOfdocking=noOfdocking;
		this.habitaleVolume=habitaleVolume;
		this.astronauts=astronauts;
		this.morePower=morePower;
		this.spaceCraftName=spaceCraftName;
		this.gravity=gravity;
		this.length=length;
		this.organisation=organisation;	
	}
	//
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.country);
		System.out.println(this.noOfdocking);
		System.out.println(this.habitaleVolume);
		System.out.println(this.astronauts);
		System.out.println(this.morePower);
		System.out.println(this.spaceCraftName);
		System.out.println(this.gravity);
		System.out.println(this.length);
		System.out.println(this.organisation);
	}
	//
	
}
