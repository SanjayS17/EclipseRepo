package codingprogram.com.program;

public class FibonacciSeries {

	public static void main(String[] args) {

		int fno=0;
		int sno=1;
		System.out.println(fno);
		System.out.println(sno);
		int result=fno + sno ;
		
		while(result<300) 
		{
		 System.out.println(result);
		 fno=sno;
		 sno=result;
		 result=fno+sno;
		 
		}
	}

}
