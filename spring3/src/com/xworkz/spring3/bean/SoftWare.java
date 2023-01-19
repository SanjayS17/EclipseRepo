package com.xworkz.spring3.bean;

import org.springframework.stereotype.Component;

@Component
public class SoftWare {
	private String name;
	private double version;
	private String developer;
	private int date;
	private boolean free;
	
	public SoftWare() {
    System.out.println("creaying software.....");
	}

	@Override
	public String toString() {
		return "SoftWare [name=" + name + ", version=" + version + ", developer=" + developer + ", date=" + date
				+ ", free=" + free + "]";
	}
	
	

}
