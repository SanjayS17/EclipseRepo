package com.xworkz.spring3.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring3.bean.HardWareShop;
import com.xworkz.spring3.bean.SoftWare;
import com.xworkz.spring3.configuration.Spring3Configuration;

public class Runner {

	public static void main(String[] args) {

		ApplicationContext container=new AnnotationConfigApplicationContext(Spring3Configuration.class);

		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		HardWareShop ref = container.getBean( HardWareShop.class);
		System.out.println(ref);
		System.out.println(ref.getGstNo());
		System.out.println(ref.getOwnerName());
		System.out.println(ref.getId());
		System.out.println(ref.getAddress());
		
		SoftWare soft=container.getBean(SoftWare.class);
		System.out.println(soft);
		System.out.println(soft.getName());
		System.out.println(soft.getVersion());
		System.out.println(soft.getDeveloper());
		System.out.println(soft.getDate());
		System.out.println(soft.isFree());
		
		
		
		
	}

}
