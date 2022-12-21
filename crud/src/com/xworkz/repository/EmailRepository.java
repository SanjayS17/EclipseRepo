package com.xworkz.repository;

public interface EmailRepository {
	boolean Create(String email);
	
	default int total() {
		return 0;
	}

}
