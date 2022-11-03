package acceses.com.xworkz.oct31.boot;

import acceses.com.xworkz.oct31.code.Address;
import acceses.com.xworkz.oct31.code.City;
import acceses.com.xworkz.oct31.code.Company;
import acceses.com.xworkz.oct31.code.Country;
import acceses.com.xworkz.oct31.code.Email;
import acceses.com.xworkz.oct31.code.Job;
import acceses.com.xworkz.oct31.code.Location;
import acceses.com.xworkz.oct31.code.Person;
import acceses.com.xworkz.oct31.code.State;

public class PersonRunner {

	public static void main(String[] args) {

		State state = new State("karnataka", "karunadu", "bomai", 99048374);
		state.display();
		//
		Country country = new Country("india", "dropadi", "bangalore", 354.53);
		country.display();
		//
		City city = new City("bangalore", "bangalore", 100.7, 30);
		city.display();
		//
		Location location = new Location(12, "kalasipalya");
		location.display();

		//
		Address address = new Address();
		address.display();
		//
		Company company = new Company("wipro","sjdhhf");
		company.display();
		//
		Job job = new Job(2345556,"assistanceengineer",3);
		job.display();
		//
		Email email = new Email(3, 1234455, 123345566);
		Email email1 = new Email(4, 132553, 34354647);
		Email email2 = new Email(5, 332553, 33354647);
		Email email3 = new Email(6, 332553, 43354647);
		Email email4 = new Email(5, 232553, 44354647);
		Email[] mails = { email, email1, email2, email3, email4 };
         //
	
		Person person = new Person("natraj");
		person.setEmail(mails);	
		person.display();
	}

}
