package exception.com.thro;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class D {
	public static void main(String[] args) {
		
	try 
	{
		FileReader f=new FileReader("demo.txt");
	}
	catch (FileNotFoundException e) 
	{
		System.out.println("file not found");
	}
		

}
}
// FileNotFoundException is checked exception