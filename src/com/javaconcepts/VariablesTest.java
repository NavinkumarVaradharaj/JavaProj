package com.javaconcepts;

public class VariablesTest {
	
	//Class variable with initialization
	String s = "Navin";
	
	//Class variable without initialization
	int marks;
	
	//Static variable with Initialization
	static String name = "james";
	//Final variable with Initialization
	final int err = 400;
	
	public void method1() {	
		s = "kumar";
		marks = 24;
		name = "gosling";
		//Final variable cannot be assigned to new value
		//err = 401;
		
		//Local Final variable
		final String names = s ;
		System.out.println(names);
		
		//Local Variable
		int marks = 40;
		
		System.out.println(s);
		System.out.println(marks);
	}
	
	public void method2() {
	//	System.out.println(n);
		s = "james";
		System.out.println(marks);
	}
	
	public void method3() {
		System.out.println(s);
		System.out.println(marks);
	}
	
	public static void main(String[] args) {
		VariablesTest v = new VariablesTest();
		v.method1();
		v.method2();
		
		
		
		
	}

}
