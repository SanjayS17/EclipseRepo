package com.xworkz.boot.method;

public class Person  implements SbiBank{

	@Override
	public String accType() 
	{
		System.out.println("acc type");
		return null;
	}

	@Override
	public double creditamount()
	{
		System.out.println("creditamount");
		return 0;
	}

	@Override
	public double depositamount() 
	{
		System.out.println("depositamount");
		return 0;
	}

	@Override
	public String name() 
	{
		System.out.println("name");
		return null;
	}

	@Override
	public long accnumber() 
	{
		System.out.println("accnumber");
		return 0;
	}
	
	public static void main(String[] args) {
		
		SbiBank bank=new Person();
		
		bank.accnumber();
		bank.accType();
		bank.depositamount();
		bank.creditamount();
		bank.name();
		
	}
	
	
	

}
