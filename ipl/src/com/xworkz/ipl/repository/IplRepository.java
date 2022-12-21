package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.IplDTO;

public interface IplRepository {
	
	boolean created(IplDTO dto);
	default int total() {
		return 0;
	}
	

}
