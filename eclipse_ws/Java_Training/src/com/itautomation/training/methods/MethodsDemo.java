/*
 * [access specifier] [access modifier] returntype name([arguments separated by ','])
	{
		
	}

	
	 * return type  1. Any Value (primitve data type or derived data type)
	 * 				2. void
	 */

package com.itautomation.training.methods;

public class MethodsDemo {
	
	public static void main(String[] args) 
	{
		MethodsDemo md =  new MethodsDemo();
		MethodsDemo md2 =  new MethodsDemo();
//		md.greetUser("Aravinda",36);
//		md2.greetUser("XYZ", 22);
//		
		System.out.println(md.userCountry());
	}
	

//	void greetUser(String abc,int age)
//	{
//		System.out.println("Welcome USer - " + abc + " with age - " + age);
//		
//	}
	
	String userCountry()
	{
		return "user belongs to India!!!!";
	//	return str;
				
		
	}
	
	int userMoble()
	{
		return 1001100;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
