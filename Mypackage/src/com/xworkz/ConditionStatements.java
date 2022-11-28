package com.xworkz;

public class ConditionStatements {

	public static void main(String[] args) {
		
//1=simple if statements
        
		System.out.println("start");
		
		int n=5;
		
		if(n<=10) // if(5<=10) ->if (true)
		{
			System.out.println(n +" is lesser than or equal to 10");
		}
		System.out.println("end");
		
		System.out.println("11111111111111111111111111111111111111111111");
		
// 2=if else statement
		
		int a=10;
		int b=20;
		
		if(a<=b)
		{
			System.out.println(a+" is lesser than or equal to "+b);
		}
		else
		{
			System.out.println(a+" is greater than"+b);
		}

System.out.println("&&&&&&&&&&&&&&&&");
		
		int a1=100;
		int b1=20;
		
		if(a1<=b1)// if it is false
		{
			System.out.println(a1+" is lesser than or equal to "+b1);
		}
		else
		{
			System.out.println(a1+" is greater than "+b1);
		}
		
System.out.println("&&&&&&&&&&&&&&&&&&&");
		
		if(true)
		{
			System.out.println("hi bro");
		}
		else
		{
			System.out.println("bye bro");
		}
		
System.out.println("&&&&&&&&&&&&&&&&&&");
		
		if(false)
		{
			System. out.println("hi bro");
		}
		else
		{
			System.out.println("bye bro");
		}
		
System.out.println("2222222222222222222222222222222222222222222222222");
		
// 3=if else if statement
		
		int x=5;
		int y=10;
		
		if(x<y)//(5<=10) ->if(true)
		{
			System.out.println(x+" is lesser than "+y);
		}
		else if(x>y)//false or (10>=5) it execute
		{
			System.out.println(x+"is greater than "+y);
		}
		else//false (10=10) it will be execute
		{
			System.out.println(x+" is equal "+y);
		}
		
		
	// example
		int marks=85;
		
		if(marks>=81 && marks<=100)
		{
			System.out.println("distinction");
		}
		else if(marks>=35 && marks<=80)// marks 80 this will exevute
		{
			System.out.println(" first class");
		}
		else if(marks>=0 && marks<=35)//marks 35 it will execute
		{
			System.out.println("fail, study well");
		}
		else                          //marks <0 or >100 this will execute
		{
			System.out.println("invalid marks");
		}
		
//example 2
		int p1=20;
		int q=15;
		int r=10;
		
		System.out.println("p:"+p1+ "q:"+q+ "r:"+r);
		
		if(p1>q && p1>r)
		{
			System.out.println("p1 is largest");
		}
		else if(q>p1 && q>r)
		{
			System.out.println("q is largest");
		}
		else
		{
			System.out.println("r is largest");
		}
		
		
		System.out.println("3333333333333333333333333333333333333333333");
		
//4=nested if
		
		int p=5;
		
		if(p<=10)//true  outer if p=5
		{
			System.out.println("inside outer if");
			
			if(p==5)// true inner if p=7
			{
				System.out.println("p is equal to 5 ");
			}
			else// inner else 
				System.out.println("p is not equal to 5");
		}
		else //outer else p=70
		{
			System.out.println("p is greater than 10");
		}
		
		System.out.println("&&&&&&&&&&&&&&&&&");
	// example 
	// login validation
		
		String id ="admin";
		int password=123;
		
		if(id=="admin")
		{
			System.out.println("user id is valid");
			
			if(password == 123)
			{
				System.out.println("password is valid");
				System.out.println("login successful");
			}
			else
			{
				System.out.println("password is invalid");
				System.out.println("login is unsuccessful:)");
			}
		}
		else
		{
			System.out.println("user id is invalid");
			System.out.println("login un successful:)s");
		}
		
		System.out.println("44444444444444444444444444444444444444444444444");
		
//5=switch statements
		
		int choice=3;
		
		switch(choice)
		{
		case 1:System.out.println("in case-1");//1==1,2,3,4
		break;
		
		case 2:System.out.println("in case-2");//2==2,3,4
		break;
		
		case 3:System.out.println("in case-3");//3==3,4,5, it will be execute
		break;
		default:System.out.println("invalid");
		
		}
		
		System.out.println("&&&&&&&&&&&&&&&&&&");
		
 // for grade validation it is used for comparison 
		// we can not compare decimal nos
		
		
	  char grade='C';
	  
	  switch(grade)
	  {
		  case 'A':System.out.println("excellent ->distinction");
		  break;
		  
		  case 'B':System.out.println("good ->first class");
		  break;
		  
		  case 'C':System.out.println("bad ->fail:)");
		  break;
		  
		  default : System.out.println("invalid grade");
		    
	  }
		
			
		
	
	}

}
