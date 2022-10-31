package com.oct27.boot;

import com.oct27.enumfiles.PillarShape;
import com.oct27.things.Pillar;

public class PillarRunner {

	public static void main(String[] args) {
	
		Pillar pillar=new Pillar(201,"rajajinagar",PillarShape.ROUND);
       pillar.constructing("pillar");
       pillar.constructing( "pillar2");
       pillar.display();
       

	}

}
