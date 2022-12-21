package exception.com.thro;

public class C {

	public static void main(String[] args) {

		for (int i =1; i<=5; i++)
		{
			System.out.println((i));
			
			try 
			{
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			
			//thread is a predefined class in the java.long package
			//static method called sleep
		}
	}

}
