package com.oct27.things;

import com.oct27.enumfiles.PillarShape;

public class Pillar {
  public int id;
  public String place;
  public PillarShape pillarShape=PillarShape.ROUND;
  public Company company=new Company("kavitha","construction company");
  
  
  
  public Pillar(int id,String place,PillarShape pillarShape ) {
	  super();
	  this.id=id;
	  this.place=place;
	  this.pillarShape=pillarShape;  
  }
	//
  public void constructing(String name) {
	  System.out.println("running construction");
	  System.out.println("constructing:"+name);
	  if(company!=null) {
		  this.company.startCompany();
	  }
	  else {
		  System.out.println("company is null");
	  }
  }
  public void display() {
	  System.out.println("id:"+ this.id);
	  System.out.println("place:"+this.place);
	  System.out.println("shape:"+this.pillarShape);
	  this.company.showOff();
	  
  }
}
