package acceses.com.xworkz.oct31.boot;

import acceses.com.xworkz.oct31.code.Address;
import acceses.com.xworkz.oct31.code.Company;
import acceses.com.xworkz.oct31.code.Email;
import acceses.com.xworkz.oct31.code.Job;
import acceses.com.xworkz.oct31.code.Location;
import acceses.com.xworkz.oct31.code.Person;

   public class PersonRunner {

	public static void main(String[] args) {
		
	Location location=new Location();
	
	//
    Address address=new Address();
    address.display();
     //
    Company company=new Company();
    company.display();
     //
    Job job=new Job();
    job.display();
     //
   
      Email email=new Email(3,1234455,123345566);
      
      Email email1=new Email(4,132553,34354647);
      Email email2=new Email(5,332553,33354647);
      Email email3=new Email(6,332553,43354647);
      Email email4=new Email(5,232553,44354647);
     
    	  Email[] mails= {email,email1,email2,email3,email4};	
      
    	   
    	  Person person=new Person();
    	      person.setEmail(mails);
    	      person.display();
	}

}





	
