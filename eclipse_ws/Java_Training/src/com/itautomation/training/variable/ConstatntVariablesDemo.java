package com.itautomation.training.variable;

public class ConstatntVariablesDemo 
{
	
	static int x=100;
	static final double PI = 3.142;
	
	//method
	public static void main(String[] args)
	{
		int i;
		i = 10;
		System.out.println(i); //10
		x = x + i;
		//PI = 100;
		System.out.println(x);  //110
		test();
		System.out.println(x);  //
		
		
	}

	
	public static void test()
	{
		int i;
		i = 20;
		System.out.println(i); //20
		x = x + i;
		System.out.println(x); //130
		System.out.println(PI * 10);
	}
}