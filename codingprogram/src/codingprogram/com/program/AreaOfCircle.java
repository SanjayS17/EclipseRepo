package codingprogram.com.program;

public class AreaOfCircle {

	public static void main(String[] args) {

		double x=area();
		System.out.println(x);
	}
	static double area() {
		double pi=3.142;
		int r=3;
		double c=pi*r;
		System.out.println("the value of pi*r is "+c);
		return c;
		
	}

}
