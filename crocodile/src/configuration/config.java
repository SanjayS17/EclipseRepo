package configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("configuration")
public class config {

	public config() {
		System.out.println("by default constructor ...");

	}

}
