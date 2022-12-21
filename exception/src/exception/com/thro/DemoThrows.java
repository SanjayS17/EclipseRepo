package exception.com.thro;

public class DemoThrows {
	
	static void div() throws ArithmeticException
	{
		System.out.println(10/0);
	}
	public static void main(String[] args)
	{
		System.out.println("statr");
		
		try 
		{
		div();
		}
		catch(Exception e)
		{
		System.out.println("handled");	
		}
		
		System.out.println("end");
	}
	

}
