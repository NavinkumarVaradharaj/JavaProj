package com.javaconcepts;

public class MethodsTest {
	
	public void method1() {
		System.out.println("Method 1");
	}

	//Static method
	public static void method2() {
		System.out.println("Static method");
	}
	
	public final void method3() {
		System.out.println("Final method");
	}
	
	public static void main(String[] args) {
		
		method2();
	}
}
