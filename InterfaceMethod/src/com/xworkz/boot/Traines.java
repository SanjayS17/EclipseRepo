package com.xworkz.boot;

public class Traines  implements xworkzRules{

	@Override
	public float timing() {
System.out.println("timings");
return 0;
	}

	@Override
	public int noOfTraines() {
System.out.println("nooftraines");
return 0;
	}

	@Override
	public int noOfteachingstaff() {
System.out.println("noofteachingstaff");
return 0;
	}

	@Override
	public double donation()
	{
		System.out.println("donation");
		return 0;
	}

	@Override
	public int coursePeriod()
	{
		System.out.println("courseperiod");
		return 0;
	}
	public static void main(String[] args) {
		
		xworkzRules xworkzRules=new Traines();
		
		xworkzRules.coursePeriod();
		xworkzRules.donation();
		xworkzRules.noOfteachingstaff();
		xworkzRules.noOfTraines();
		xworkzRules.timing();
		
	}
	
	

}
