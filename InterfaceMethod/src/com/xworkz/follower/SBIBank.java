package com.xworkz.follower;

import com.xworkz.rules.BankRules;


public class SBIBank implements BankRules {

	@Override
	public boolean maintainMinBalance() {
		System.out.println("Running maintain minimum balance");
		return true;
	}

	@Override
	public double balance() {
		System.out.println("Running balance");
		return 1000;
	}

}


