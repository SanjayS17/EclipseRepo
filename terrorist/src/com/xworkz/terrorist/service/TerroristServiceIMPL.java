package com.xworkz.terrorist.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.xml.bind.Validator;

import com.xworkz.terrorist.TerroristDTO;

public class TerroristServiceIMPL implements TerroristService {

	
	
	
	public TerroristServiceIMPL() {
		System.out.println("Created Terrorist Service Implementation using no-args contructor");
	}

	@Override
	public boolean validatingAndSaving(TerroristDTO dto) {
    System.out.println("executing the Validating and saving is Now" );
    System.out.println("Dto initialized:"+dto);
    
    
    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    javax.validation.Validator validator = factory.getValidator();
    Set<ConstraintViolation<TerroristDTO>> violations = validator.validate(dto);
      if(!violations.isEmpty())
      {
    	  System.err.println("Error is there do something buddy");
    	  violations.forEach(e->System.err.println(e.getMessage()));
    	  return false;
      }
    System.out.println("No validation error");
    return true;
	}

}
