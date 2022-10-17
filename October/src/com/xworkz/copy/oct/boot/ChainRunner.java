package com.xworkz.copy.oct.boot;
import com.xworkz.copy.oct.*;
public class ChainRunner {

	public static void main(String[] args) {
		Chain chain = new Chain('R');
		System.out.println(chain.type);
		
		
		chain = new Chain('T',700);
		System.out.println(chain.type);
		System.out.println(chain.price);
		
		chain =  new Chain('S',500,10);
		System.out.println(chain.type);
		System.out.println(chain.price);
		System.out.println(chain.length);
		
		
		chain=new Chain('X',1000,9,"Stainless Steel");
		System.out.println(chain.type);
		System.out.println(chain.price);
		System.out.println(chain.length);
		System.out.println(chain.material);
		
		
		chain =new Chain('X',1000,9,"Stainless Steel","tying for dog");
		System.out.println(chain.type);
		System.out.println(chain.price);
		System.out.println(chain.length);
		System.out.println(chain.material);
		System.out.println(chain.usedFor);
		
		chain=new Chain('X',1000,9,"stainless steel","tying for dog",true);
		System.out.println(chain.type);
		System.out.println(chain.price);
		System.out.println(chain.length);
		System.out.println(chain.material);
		System.out.println(chain.usedFor);
		System.out.println(chain.weight);
		
		chain=new Chain('X',1000,9,"stainless steel","tying for dogs",true,3.5);
		System.out.println(chain.type);
		System.out.println(chain.price);
		System.out.println(chain.length);
		System.out.println(chain.material);
		System.out.println(chain.usedFor);
		System.out.println(chain.weight);
		
	
	}

	
	
	
	

	

}
