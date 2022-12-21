package exception.com.thro;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Example {
	
	void readData() throws FileNotFoundException 
	{
		FileReader f=new FileReader(" dinga.text");
		
	}
	public static void main(String[] args) {
		
		Example e=new Example();
		try {
			e.readData();
		} 
		catch (FileNotFoundException e1)
		{
			System.out.println("filenotpresent");
		}
	}

}
