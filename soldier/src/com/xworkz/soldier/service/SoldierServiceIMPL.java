package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;

import org.springframework.validation.Validator;

import com.xworkz.soldier.dto.SoldierDTO;
import com.xworkz.soldier.repository.SoldierRepo;

public class SoldierServiceIMPL implements SoldierService {
	
 private SoldierRepo soldierRepo;
 
 
 

	public SoldierServiceIMPL() {
   System.out.println("create SoldierServiceIMPL by no args constructor...");
	}

	public void setSoldierRepo(SoldierRepo soldierRepo) {
		this.soldierRepo= soldierRepo;
	}



	@Override
	public boolean validateAndsave(SoldierDTO dto) {
		
		System.out.println("Starting validateAndSave");
		System.out.println("dto passed: "+ dto);
		

		

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		javax.validation.Validator validator = factory.getValidator();
		Set<ConstraintViolation<SoldierDTO>> violations = validator.validate(dto);
		if(!violations.isEmpty()) {
			System.err.println("There are validation error");
			violations.forEach(v -> {System.out.println("Violating message:"+ v.getMessage());
			});
			return false;

		}else {
			System.out.println("data is valid");
			boolean saved = soldierRepo.save(dto);
			System.out.println("Dto saved using repo" + saved);
			return saved;
		}
		
		
	}

}
