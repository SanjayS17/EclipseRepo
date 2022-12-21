package exception.com.thro;

import java.util.Iterator;

public class Test {

    static void display() throws Exception
    { 
		for (int i=0; i<=5; i++) 
		{
			System.out.println(i);
			Thread.sleep(3000);
		}
	
    }
    public static void main(String[] args) 
    {
		try
		{
			display();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
    

}
