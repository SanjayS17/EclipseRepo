package com.oct28.boot;

import com.oct28.GenderName;
import com.oct28.things.City;
import com.oct28.things.Country;
import com.oct28.things.Name;
import com.oct28.things.President;



public class CountryRunner {

	public static void main(String[] args) {
	
		Country country=new Country("india");
		//
		President president=new President("Dropadi");
		//
		president.setGender(GenderName.MALE);
		//
		country.setPresident(president);
		//
		Name name1=new Name("sanjay","ganesh","natraj");
		City city1=new City(name1,true,3425.7);
		
		Name name2=new Name("dropadi","apj","arun");
		City city2=new City(name2,false,4352.7);
		//
		
		City[] city= {city1,city2};
		country.setCities(city);
		country.display();
		
		
		
			}

		
	}


