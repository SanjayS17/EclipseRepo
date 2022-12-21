package com.xworkz.follower;

import com.xworkz.rules.HospitalRules;

public class Doctor implements HospitalRules {

	@Override
	public boolean wearMask() {
		System.out.println("Running wear mask...");
		return true;
	}

	@Override
	public boolean maintainSilence() {
		System.out.println("Running maintain silence...");
		return true;
	}

}


