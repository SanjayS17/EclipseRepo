package com.xworkz.copy.oct17.boot;


import com.xworkz.copy.oct17.Textileshop;

public class TextileShopRunner {


		public static void main(String[] args) {
			String[] types={"ladies","gents"};
			String[] color= {"black","white"};
			String[] shopName= {"mohan","manu","arun"};
			String[] usersName= {"arun","mohan","natraj"};
			String[] clothBrands= {"levis","puma","sports"};
		 	
			
			Textileshop textileshop= new TextileShop ("ladies",700,1.0,1f,"square",types,color,shopName,usersName,clothBrands);
			
		
			textileshop.display(); 

		}

	

}
