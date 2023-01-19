package com.xworkz.soldier.repository;

import com.xworkz.soldier.dto.SoldierDTO;

public class SoldierRepoIMPL implements SoldierRepo {
	

	public SoldierRepoIMPL() {
         System.out.println("create SoldierRepoIMPL by no args constructor" );
	}

	@Override
	public boolean save(SoldierDTO dto) {
		System.out.println("running save");
		System.out.println("DTO"+dto);
		return false;
	}

}
