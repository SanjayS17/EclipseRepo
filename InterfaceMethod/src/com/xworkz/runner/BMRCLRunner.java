package com.xworkz.runner;

import com.xworkz.follower.Passengers;
import com.xworkz.governer.BMRCL;
import com.xworkz.rules.MetroRules;

public class BMRCLRunner {


	public static void main(String[] args) {

		MetroRules metro = new Passengers();
		BMRCL bmrcl = new BMRCL(metro);
		bmrcl.display();
	}

}


