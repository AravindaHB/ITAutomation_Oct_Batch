package com.itautomation.training.variable;

public class StaticBlock {

	static int counter=0;
	static
	{
		System.out.println("i'm executing first..");
	}
	
	{
		System.out.println("Viewers   : " +  ++counter);
	}
	
	
	public static void main(String[] args) {
		System.out.println("main started");
		StaticBlock sb1 = new StaticBlock();
		StaticBlock sb2 = new StaticBlock();
		StaticBlock sb3 = new StaticBlock();
		StaticBlock sb4 = new StaticBlock();
		StaticBlock sb5 = new StaticBlock();
		
		System.out.println("main ended");
	}
}
