package com.xworkz.runner;

import com.xworkz.follower.Doctor;
import com.xworkz.governer.HospitalManagement;
import com.xworkz.rules.HospitalRules;

public class HospitalManagementRunner {

	public static void main(String[] args) {

		HospitalRules hospital = new Doctor();
		HospitalManagement management = new HospitalManagement(hospital);
		management.checking();
	}

}
