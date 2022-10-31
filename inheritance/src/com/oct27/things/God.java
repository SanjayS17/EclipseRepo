package com.oct27.things;

public class God {

	public String name;
	public String gender;
	public String mainpower;
	public Weapon weapon=new Weapon("archery","for the war",20000);
	
	public God(String name,String gender,String mainPower, String mainpower) {
		super();
		this.name=name;
		this.gender=gender;
		this.mainpower=mainpower;	
	}
	//
	public void exposeAll(){
		System.out.println("name"+name);
		System.out.println("gender"+gender);
		String mainPower = null;
		System.out.println("mainPower:"+mainPower);
		if(weapon!=null) {
			weapon.expose();
			weapon.name="raavan";
			System.out.println("name"+weapon.name);	
		}
		else {
			System.out.println("weapon is pointing to null");
		}
	}
	
}
