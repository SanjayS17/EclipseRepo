package bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.config;
import things.Browser;
import things.FireBox;

public class Tester {

	public static void main(String[] args) {

		ApplicationContext context=new AnnotationConfigApplicationContext(config.class);
		
		Browser b=context.getBean(FireBox.class);
		b.browser();
	}

}
