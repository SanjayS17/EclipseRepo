package interview.com.logic.program;
import java.util.Scanner;
public class Eureka {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		int end=scanner.nextInt();
		int Start=scanner.nextInt();
		//System.out.println(Start);
		//System.out.println(end);
		for(int i=Start;i<=end;i++) 
		{
		// System.out.println(i);	
		 int temp=i;
		 int num=temp;
		 System.out.println(""+temp);
		 int count=0;
		 for(;temp!=0;temp=temp/10) 
		 {
			 count++;
		 }
		 int n=temp;
		 int ref=0;
		 int sum=0;
		 for(;n>0;n=n/10)
		 {
			 ref=n%10;
			 sum+=(int)Math.pow(ref,count);
			 count--;
			 
		 }
		}
		
		
		

	}

}
