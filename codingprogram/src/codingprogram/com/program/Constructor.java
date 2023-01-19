package codingprogram.com.program;

public class Constructor {
	int id;
	String name;
	
	Constructor(int i,String n){
		id=i;
		name=n;
	}
	
	void Display() {
		System.out.println(id+""+name);
	}
	

	public static void main(String[] args) {
		Constructor s1=new Constructor(12,"sanjay");
		Constructor s2=new Constructor(13,"manju");
      s1.Display();
      s2.Display();
		
	}

}
