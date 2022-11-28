package com;

import java.util.Locale;

public class StringMethods {

	public static void main(String[] args) 
			{
			 String str = "Welcome to the Assassin Creed World";
			 
			 for(int i=0;i<str.length();i++)
			 {
				 if(i%2!=0)
				 {
					 System.out.println("Char:"+i+"place:"+str.charAt(i));
				 }
			 }
			
			 System.out.println("===================1=====================");
			 
			 String str1 = "Assassin Creed";
			 
			 System.out.println("String length is:"+str1.length());
			 

			 System.out.println("===================2=====================");
			 
			 int value = 30;
			 
			 String s1 = String.valueOf(value);
			 
			 System.out.println("Using String valuof() method:"+s1+24); //concatenating using the String
			 

			 System.out.println("=====================3===================");
			 
			 String s2 = "Hey String i Hate You ";
			 
			 System.out.println("----Using trim() method-----");
			 
			 System.out.println(s2+"i love you");
			 
			 System.out.println(s2.trim()+"i love you");
			 
			 System.out.println("==================4======================");
			 
			 String str3 = "hello my string you look so ugly";
			 
			 String s1upper = str3.toUpperCase();
			 
			 System.out.println("Using uppercase() method:"+s1upper);
			 
			 System.out.println("==================5======================");
			 
			 String str4 = "String is big thing in java";
			 
			 String turkish = str4.toUpperCase(Locale.forLanguageTag("tr"));
			 
			 System.out.println("--this method converts all lower case to upper case--");
			 
			 System.out.println(turkish);
			 
			 System.out.println("====================6====================");
			 
			 String str5 = "STRING IS THE BEST THING IN THE  WORLD";
			 
			 String sip = str5.toLowerCase();
			 
			 System.out.println(sip);
			 
			 System.out.println("===================7=====================");
			 
			 String str6 = "USING THIS METHOD IT CONVERTS UPPER CASE TO LOWER CASE";
			 
			 String sip1 = str6.toLowerCase(Locale.ENGLISH);
			 
			 System.out.println(sip1);
			 
			 System.out.println("====================8====================");
			 
			 String str7 = "The String is the complicated in the world";
			 
			 System.out.println("--it will give the index of the substring--");
			 
			 int index = str7.indexOf("the");
			 
			 System.out.println("Index of Substring:"+ index);
			 	 
			 System.out.println("====================9====================");
			 
			 String str8 = new String("Video Games");
			 
			 String str9 ="my love";
			 
			 String str10 = str8.intern();
			 
			 System.out.println(str8==str9);
			 System.out.println(str9==str10);
			 
			 System.out.println("====================10====================");
			 
			 String str11 = "";
			 String str12 = "In java you can learn anything accept java";
			 
			 System.out.println("--Here its check the weather input string empty or not it reutrn in boolean values(true or false)--");
			 
			 System.out.println(str11.isEmpty());
			 System.out.println(str12.isEmpty());
			 
			 System.out.println("====================11====================");
			 
			 String str13 = "Is String in java";
			 
			 
			 System.out.println(str13);
			 
			 str13 = str13.concat("belongs to the Class? does anyone explain about this");
			 
			 System.out.println(str13);
			 
			 
			 System.out.println("===================12=====================");
			 
			 String str14 = "--Using this replace() its gonna change old character or new char by replacing it--";
			 
			 System.out.println(str14);
			 
			 String str15 = "String is the non-primitive data type";
			 
			 String replaceString = str15.replace('i', 'e');
			 
			 System.out.println(replaceString);
			 
			 System.out.println("=====================13===================");
			 
			 System.out.println("--Using split method its gonna split the one line many form and print it line by line--");
			 
			 String str16 = "java String split method using split method";
			 
			 String[] str17 = str16.split("\\s");
			 
			 for(String w:str17)
			 {
				 System.out.println(w);
			 }
			 
			 System.out.println("====================14====================");
			 
			 String s18 = new String("Hello java i love you");
			 
			 String s19 = "Hello java i love you";
			 
			 String s20 = s18.intern();
			 
			 System.out.println(s18==s19);
			 
			 System.out.println(s19==s20);
			 
			 System.out.println("===================15=====================");
			 
			 String str18 = "Hello Java";
			 String str19 = "Hello Java";
			 
			 System.out.println(str18.compareTo(str19));
			 
			 System.out.println("==================16======================");
			 
			 String str20 = "HELLO JAVA";
			 String st21 = "hello jadfg";
			 
			 System.out.println(str20.compareToIgnoreCase(str20));
			 
			 System.out.println("====================17====================");
			 
			 String str21 = "Lets learn String";
			 System.out.println(str21.contains("let"));
			 System.out.println(str21.contains("g"));
			 System.out.println(str21.contains("z"));
			 
			 System.out.println("===================18=====================");
			 
			 String str22 = "Hello";
			 System.out.println(str22.contentEquals("Hello"));
			 System.out.println(str22.contentEquals("l"));
			 System.out.println(str22.contentEquals("O"));
			 
				 
			 System.out.println("====================19====================");
			 
			 String str25 = "Hello World";
			 System.out.println(str25.endsWith("rl"));
			 System.out.println(str25.endsWith("ld"));
			 System.out.println(str25.endsWith("o"));
			 	 
		     System.out.println("=====================20===================");
		 
			 String str26 = "Hello";
			 String str27 = "Hello";
			 String str28 = "Another String";
			 
			 System.out.println(str26.equals(str27));
			 System.out.println(str26.equals(str28));
			 
			 System.out.println("====================21====================");
			 
			 String str29 = "Hello";
			 String str30 = "Hello";
			 String str31 = "Another String";
			 
			 System.out.println(str26.equalsIgnoreCase(str27));
			 System.out.println(str26.equalsIgnoreCase(str28));
			 
			 System.out.println("===================22=====================");
			 
			 String str32 = "Hello World";
			 
			 System.out.println(str32.hashCode());
			 
			 System.out.println("===================23=====================");
			 
			 String str33 = "Hello Java";
			 String str34 = "";
			 
			 System.out.println(str33.isEmpty());
			 System.out.println(str34.isEmpty());
			 	 
			 System.out.println("===================24=====================");
			 
			 String str35 = "gsdggfdsgbgrenrketnnsknrktnrehdghdhkkt";
			 System.out.println(str35.length());
			 
			 
			 }
			 
			



	}


