package com.xworkz.spring4.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring4")
public class NewsPaperConfiguration {

	public NewsPaperConfiguration() {
       System.out.println("creating newspaper by defoult constructor...");
	}
	
	
	

}
