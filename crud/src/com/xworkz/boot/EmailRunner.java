package com.xworkz.boot;

import com.xworkz.repository.EmailRepository;
import com.xworkz.repository.EmailRepositoryIMPL;

public class EmailRunner {

	public static void main(String[] args) {

		
		EmailRepository emailRepository=new EmailRepositoryIMPL();
		
		emailRepository.Create("js.bn@gmail.com");
		emailRepository.Create("jhjhgh@gmail.com");
		emailRepository.Create("dfdfgd@gmail.com");
		emailRepository.Create("gfgf@gmail.com");
		emailRepository.Create("fdfd@gmail.com");
		emailRepository.Create("kljkj@gmail.com");
		emailRepository.Create("cfgd@gmail.com");
		emailRepository.Create("hgfhf@gmail.com");
		emailRepository.Create("gjg@gmail.com");
		emailRepository.Create("gkjhg@gmail.com");
		//emailRepository.Create("sanjay.@gmail.com");
		
		System.out.println(emailRepository.total());
			
	}

}
