package com.itautomation.training.variable;

public class InstanceVariablesDemo 
{
	
	int x; // Global variable and non-static ==> instance variable(non-static member)
	static int y=1000;
		
	public static void main(String[] args) 
	{
		
		InstanceVariablesDemo obj1 = new InstanceVariablesDemo();
		InstanceVariablesDemo obj2 = new InstanceVariablesDemo();
		
		
		obj1.x = 100;
		obj1.y= 500;
		obj2.x = 200;
		System.out.println(obj1.x);
		System.out.println(obj2.x);
		System.out.println(obj1.y);
		System.out.println(obj2.y);
		obj1.test();
		obj2.test();
		
		
		test1();
		InstanceVariablesDemo.test1();
		obj1.test1();
			
	}
	
	
	
	public static void test1()
	{
		System.out.println("static method");
	}
	
	public void test()
	{
		System.out.println("test method");
	}
	
	
	

}
