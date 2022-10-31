package com.oct27.things;



public class Temple {

	public String name;
	public String mainPriest;
	public String noOfVisitors;
	public God god=new God("ram","male","one wife", mainPriest);
	
	
	public Temple(String name,String mainPriest,String noOfVisitors) {
		
		super();
		this.name=name;
		this.mainPriest=mainPriest;
		this.noOfVisitors=noOfVisitors;
	}
	//
	public void thorisu() {
		System.out.println("name"+name);
		System.out.println("mainPriest"+mainPriest);
		System.out.println("noOfVisitors"+noOfVisitors);
		god.exposeAll();
		god.mainpower="shaapa kododu";	
	}
	//
	
}
