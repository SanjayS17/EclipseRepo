package com.xworkz.terrorist.runner;

import java.time.LocalDateTime;

import com.xworkz.terrorist.TerroristDTO;
import com.xworkz.terrorist.service.TerroristService;
import com.xworkz.terrorist.service.TerroristServiceIMPL;

public class TerroristRunner {

	public static void main(String[] args) {

		TerroristDTO dto=new TerroristDTO();
	
		dto.setName("natraj");
		dto.setAge(50);
		dto.setCountry("india");
		dto.setAlive(false);
	   dto.setOrganisation("benki");
	   dto.setPrison(false);
	   dto.setSpecialization("Killing the talanted people");
	   dto.setCreatedAt(LocalDateTime.now());
	   dto.setUpdatedAt(LocalDateTime.now());
	   dto.setCreatedBy("arun");
	   dto.setUpdatedBy("arun");
	   System.out.println(dto);
	   

		TerroristService service = new TerroristServiceIMPL();
		service.validatingAndSaving(dto);
	}

}
