package com.itautomation.training.methods;

public class Test2 extends Test1
{

	public void test2()
	{
		System.out.println("Test2");
	}
	
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.test();
	//	t1.test2();
		
		Test2 t2 = new Test2();
		t2.test();
		t2.test2();
		
		Test1 t3 = new Test2();
		t3.test();
		//t3.test2();
	
	
	}
}
