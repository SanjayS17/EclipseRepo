package com.oct27.boot;

import com.oct27.things.God;

public class GodRunner {

	public static void main(String[] args) {
		God god=new God("ram","male","export in archery", null);
		god.exposeAll();
		god.weapon.use="war purpose";
		

	}

}
