package com.xworkz.soldier.boot;

import com.xworkz.soldier.dto.SoldierDTO;
import com.xworkz.soldier.repository.SoldierRepo;
import com.xworkz.soldier.repository.SoldierRepoIMPL;
import com.xworkz.soldier.service.SoldierServiceIMPL;

public class SoldierRunner {

	public static void main(String[] args) {

		SoldierDTO dto = new SoldierDTO("mohamadha", 420, "Middle", "Captan", "india");
		SoldierServiceIMPL service = new SoldierServiceIMPL();
		SoldierRepo repo = new SoldierRepoIMPL();
		service.setSoldierRepo(repo);
		service.validateAndsave(dto);
	}

}
