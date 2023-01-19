package com.xworkz.spring3.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.spring3.bean.HardWareShop;

@Configuration
@ComponentScan("com.xworkz.spring3")
public class Spring3Configuration {

	public Spring3Configuration() {
System.out.println("created Spring3Configuration.....");
	}
	


	@Bean
	public int shopid() {
		System.out.println("running shop...............");

		return 18;
	}
	@Bean
	public String shopOwnerName() {
		System.out.println("running shopOwnerName...............");

		return "Dharshan";
	}
	@Bean("shopgstNo")
	public long shopOwnerGst() {
		System.out.println("running shopOwnerGst...............");

		return 5165461531L;
	}
	@Bean
	public String shopadress() {
		System.out.println("running shopadress...............");

		return "Mullahalli";
	}
	@Bean
	public String name() {
		System.out.println("running name...");
		return"ravi";
	}
	

}
