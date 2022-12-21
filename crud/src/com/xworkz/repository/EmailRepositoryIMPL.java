package com.xworkz.repository;

import com.xworkz.exception.EmailSizeExceededException;

public class EmailRepositoryIMPL implements EmailRepository {

	private String[]emails=new String[10];
	private int emailIndex=0;
	
	@Override
	public boolean Create(String email) {
		System.out.println("running create in email repo...");
		if(this.emailIndex>=this.emails.length) {
			throw new EmailSizeExceededException();
		}
		this.emails[emailIndex]=email;
		this.emailIndex++;
		return false;
		
	}
	@Override
	public int total() {
		System.out.println("running total");
		return this.emailIndex;
	}
	
}
