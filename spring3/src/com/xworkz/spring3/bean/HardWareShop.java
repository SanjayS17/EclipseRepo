package com.xworkz.spring3.bean;

import java.io.ObjectInputStream.GetField;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("HardWareShop")
public class HardWareShop {
	@Autowired
	@Qualifier("shopid")
	private int id;
	@Autowired
	@Qualifier("shopgstNo")
	private long gstNo;
	@Autowired
	@Qualifier("shopOwnerName")
	private String ownerName;
	@Autowired
	@Qualifier("shopadress")
	private String address;
	
	public HardWareShop() {
    System.out.println("creating hardwareshopusing defaultconstructor...");
	}

	@Override
	public String toString() {
		return "HardWareShop [id=" + id + ", gstNo=" + gstNo + ", ownerName=" + ownerName + ", address=" + address
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getGstNo() {
		return gstNo;
	}

	
	public String getOwnerName() {
		return ownerName;
	}

	
	public String getAddress() {
		return address;
	}

	 
}
