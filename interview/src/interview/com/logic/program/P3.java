package interview.com.logic.program;

import java.util.Iterator;

public class P3 {

	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print("i ");
			}
			System.out.println();
			
		} 
		System.out.println("++++++++");
		int n=4;
		for(int i=1;i<=n;i++) {
			//printing space
			for(int j=n-1;j>=i;j--) {
				System.out.print(" ");
			}
			//printing symbal
			for(int k=1;k<=i;k++) {
				System.out.print("$");
			}
			System.out.println(" ");
		}
		System.out.println("-----------");
		int n1=4;
		for(int i=1;i<=n1;i++) {
			//printing space
			for(int j=n1-1;j>=i;j--) {
				System.out.print(" ");
			}
			//printing symbal
			for(int k=1;k<=i;k++) {
				System.out.print(k );
			}
			System.out.println(" ");
		}
		System.out.println("66666666666");
		
		int n11=4;
		for(int i=1;i<=n11;i++) 
		{
			//printing space
			
			for(int j=n11-1;j>=i;j--) 
			{
				if(j==2) {
					System.out.print("sanjay");
				}
					
				if(j==1) {
					System.out.print("darshan");	
				}
				
				else {
					System.out.print(j);
				
				
			}
			//printing symbal
			for(int k=1;k<=i;k++)
			{
				if(k==2) {
					System.out.print("sanjay");	
				}
				
				if(k==1) {
					System.out.print("darshan");	
				}
				
				else {
					System.out.print(k);
				}
				
			}
			System.out.println(" ");
		}
			
	
			System.out.println("#####");
			
			//main loop
			 int n2=4;
			for(int i1=n2;i1>=1;i1--) {
				//printing space
				for(int j=n2-1;j>=i1;j--) 
				{
					System.out.print(" ");
				}
				//printing symbal
				for(int k=1;k<=i1;k++) 
				{
					System.out.print( k);
				}
				System.out.println(" ");
			}
	
	

		}
	}
}



