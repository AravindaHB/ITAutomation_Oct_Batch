package com.itautomation.training.variable;

public class TestOnVariables 
{
	
	int x = 10;
	
	public void test()
	{
		int y = 0;
		System.out.println(y);
		System.out.println(x);
	}
	
	public static void main(String arg[])
	{
		System.out.println("main started");
		TestOnVariables tv = new TestOnVariables();
		System.out.println(tv.x);
		tv.test();
	}
}