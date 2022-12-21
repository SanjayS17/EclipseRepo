package com.xworkz.ipl.repository;

import javax.management.RuntimeErrorException;

import com.xworkz.ipl.dto.IplDTO;

public class IplRepositoryImpl  implements IplRepository{

	private IplDTO[] ipldtos =new IplDTO[10];
	private int currentIndex=0;
	
	@Override
	public boolean created(IplDTO dto) {
		System.out.println("running create of IplDTO"+dto);
		if(this.currentIndex>=this.ipldtos.length) {
			System.out.println("size exceeded cannot add more iplteam");
			 throw new RuntimeErrorException(null);
		
		}
		this.ipldtos[this.currentIndex]=dto;
		System.out.println("saved"+dto+"in index"+this.currentIndex);
		this.currentIndex++;
		return true;
	}
	
	
}
