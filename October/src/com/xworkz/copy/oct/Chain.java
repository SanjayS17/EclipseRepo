package com.xworkz.copy.oct;

public class Chain {

		
		public char type;
		public long price;
		public float length;
		public String material;
		public double weight;
		public String stolen;
		public boolean usedFor;
		
		public Chain()
		{
			System.out.println("Dog Chain");
		}
		
		public Chain(char type)
		{
			this();
			this.type = type;
			
		}
		
		public Chain(char type,long price)
		{
			this(type);
			this.price = price;
			
		}
		
		public Chain(char type,long price,float length)
		{
			this(type,price);
			this.length = length;
			
		}
		
		public Chain(char type,long price,float length,String material)
		{
			this(type,price,length);
			this.material = material;
		}
		
		public Chain(char type,long price,float length,String material,String stolen)
		{
			this(type,price,length,material);
			this.stolen = stolen;
		}

		
		public Chain(char type,long price,float length,String material,String stolen,boolean usedFor)
		{
			this(type,price,length,stolen,material);
			this.usedFor =usedFor;
			
		}
		
		public Chain(char type,long price,float length,String material,String stolen,boolean usedFor,double weight)
		{
			this(type,price,length,material,stolen,usedFor);
			this.weight = weight;
			
		}
		


	
}

