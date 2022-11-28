package com;

public class StringTask {

	


   public static void main(String[] args) {
	String tripleRide="Triple Riding is a Kannada movie released on 25 Nov, 2022."
			+ " The movie is directed by Mahesh Gowda and featured Aditi "
			+ "Prabhudeva, Rachana Inder, Sadhu Kokila and Rangayana Raghu as lead characters";

	//Split all by space 
	String[] splitted=tripleRide.split(" ");

	for (int i=0; i < splitted.length; i++)
      {
		System.out.println(splitted[i]);
	  }
	System.out.println("---------------------------1-----------------------------");

	//logic to find no of 'R' in above sentence
	char cha = 'R';
	 int number = 0;
	  for(int i = 0; i < tripleRide.length(); i++) {
	    if(cha == tripleRide.charAt(i)) {
	     ++number;
     }
	 }

	 System.out.println("Number of " + cha + " = " + number);
	  System.out.println("--------------------------2---------------------------------");

	  // Find all digits in above string 
	int digits=0;
    for(int i=0;i<tripleRide.length();i++)
     {
    if(Character.isDigit(tripleRide.charAt(i)))
      digits++;

    }
	 System.out.println("the number of digits in the given string is:" + digits);
     System.out.println("--------------------------3-----------------------------");

	  //Split by comma (,) 
	  String[] splitByComma=tripleRide.split(",");

    for (int i=0; i < splitByComma.length; i++)
     {
	 System.out.println(splitByComma[i]);
	}
	System.out.println("---------------------------------4--------------------------");

	//Convert above string to char []
	char[] tripleRideString = tripleRide.toCharArray();

	System.out.println("char array elements:");
	for(int i=0;i<tripleRideString.length;i++) {

	System.out.println(tripleRideString[i]);
	} 
	System.out.println("------------------------------5-------------------------------");

	//Reverse above string 
	System.out.println("Reversed string:");
	for(int i=tripleRideString.length-1;i>=0;i--)
	{
	  	System.out.print(tripleRideString[i]);
	}

	System.out.println("--------------------------6---------------------------------------");

	//Convert to upper case 
	String upper_string = tripleRide.toUpperCase();
	System.out.println(upper_string);

	System.out.println("-----------------------------7--------------------------------------");

	//convert to lower case
	String lower_string=tripleRide.toLowerCase();
	System.out.println(lower_string);

	//Print all duplicate Characters
	int count=0;
	System.out.println("Duplicate Characters are:");
	for (int i = 0; i < tripleRide.length(); i++) {
	for (int j = i + 1; j < tripleRide.length(); j++) {
	 if (tripleRideString[i] == tripleRideString[j]) {
	 System.out.println(tripleRideString[j]+" ");
	count++;
	break;
	 }
     }
	 }

	//find palindrome word in above string 
	 System.out.println("--------------------------------------8------------------");
	 String rev="";
	for ( int i = tripleRide.length() - 1; i >= 0; i-- )
    rev = rev + tripleRide.charAt(i);

	 if (tripleRide.equals(rev))
    System.out.println("String:"+tripleRide+" is a palindrome");
	 else
   System.out.println("String:"+tripleRide+" is not a palindrome");

   }

}
