package com.xworkz.pizza.boot;

import com.xworkz.pizza.constant.PizzaSize;
import com.xworkz.pizza.dto.PizzaDTO;
import com.xworkz.pizza.service.PizzaService;
import com.xworkz.pizza.service.PizzaServiceIMPL;

public class PizzaRunner {

	public static void main(String[] args) {
		
		PizzaDTO pizzadto = new PizzaDTO("Corn Pizza", "Dominos", PizzaSize.SMALL, true, 99.99, "Corn", "VEG");
		System.out.println(pizzadto);
		
		
	
		PizzaService service = new PizzaServiceIMPL();
		service.validateAndSave(pizzadto);
				
	
}


}
