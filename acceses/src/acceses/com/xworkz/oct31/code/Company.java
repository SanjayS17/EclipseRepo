package acceses.com.xworkz.oct31.code;

public class Company {

	public String name;
	public String ownerName;
	public Address address=new Address();
	
	public Company() {
		
	}
	public Company(String name,String ownerName) {
		this.name=name;
		this.ownerName=ownerName;
	}
	//
	public void display() {
		System.out.println(this.name);
		System.out.println(this.ownerName);
	}
	
}
