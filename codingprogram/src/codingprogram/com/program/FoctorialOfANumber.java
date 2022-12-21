package codingprogram.com.program;

public class FoctorialOfANumber {

	public static void main(String[] args) {
     int x=5;//lets find factorial of given number5
     int result=1;//for storing result
     
     for(int i=x;i>2;i--) 
     {
    	 result=result*i;
     }
     System.out.println("factorial of " + x +" is " + result);
     
	}

}
