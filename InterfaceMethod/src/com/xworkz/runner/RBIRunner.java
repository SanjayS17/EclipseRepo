package com.xworkz.runner;

import com.xworkz.follower.SBIBank;
import com.xworkz.governer.RBI;
import com.xworkz.rules.BankRules;

public class RBIRunner {

	public static void main(String[] args) {

		BankRules bank = new SBIBank();
		RBI rbi = new RBI(bank);
		rbi.check();
	}
}
