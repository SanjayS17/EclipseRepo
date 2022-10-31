package acceses.com.xworkz.oct31.code;

public class Email {

	public int id;
	public long password;
	public long mobilenumber;
	public Company company=new Company("wipro","sanjay");
	
	public Email() {
		super();
	}
	public Email(int id,long password,long mobilenumber) {
		this.id=id;
		this.password=password;
		this.mobilenumber=mobilenumber;
	}
	//
	public void display() {
		System.out.println(this.id);
		System.out.println(this.password);
		System.out.println(this.mobilenumber);
	}
}
