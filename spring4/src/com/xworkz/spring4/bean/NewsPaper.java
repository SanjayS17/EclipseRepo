package com.xworkz.spring4.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {
	@Autowired
	@Qualifier("num")
	private int id;
	private String name;
	private String ownername;
	@Autowired
	@Qualifier("language")
	private String language;
	private double price;
	

	@Autowired
	public NewsPaper(@Qualifier("paper Name")String name, @Qualifier("ownersri")String ownername) {
		this.name = name;
		this.ownername = ownername;
	}
	
	@Override
	public String toString() {
		return "NewsPaper [id=" + id + ", name=" + name + ", ownername=" + ownername + ", language=" + language
				+ ", price=" + price + "]";
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getOwnername() {
		return ownername;
	}
	public String getLanguage() {
		return language;
	}
	public double getPrice() {
		return price;
	}


}
