package boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.Application;
import configuration.SpringConfiguration;
import things.Area;
import things.Bus;
import things.Chocolate;
import things.City;
import things.Cycle;
import things.Fish;
import things.Girl;
import things.God;
import things.Mall;
import things.Mask;
import things.Milk;
import things.Park;
import things.Patient;
import things.Road;
import things.Temple;


public class AreaRunner {

	public static void main(String[] args) {

		
    ApplicationContext spring=new AnnotationConfigApplicationContext(SpringConfiguration.class);
    
    Road ref=spring.getBean(Road.class);
    Bus ref1 = spring.getBean(Bus.class);
	Cycle cycle = spring.getBean(Cycle.class);
	Girl girl = spring.getBean(Girl.class);
	Milk milk = spring.getBean(Milk.class);
	Mask mask = spring.getBean(Mask.class);
	Patient patient = spring.getBean(Patient.class);
	Chocolate chocolate = spring.getBean(Chocolate.class);
	Area area = spring.getBean(Area.class);
	City city = spring.getBean(City.class);
	Fish fish = spring.getBean(Fish.class);
	Temple temple = spring.getBean(Temple.class);
	God god = spring.getBean(God.class);
	Park park = spring.getBean(Park.class);
	Mall mall = spring.getBean(Mall.class);
	Application application = spring.getBean(Application.class);
	System.out.println(ref);
    
    
    
	}

}
