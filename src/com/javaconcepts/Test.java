package com.javaconcepts;

public class Test {
	
	public void add() {
		int a =10;
		int b =20;
		int c = a+b;
		System.out.println(c);
	}
	
	public void mul() {
		int a = 10;
		System.out.println(a*5);
	}
	
	public static void main(String[] args) {
		Test t = new Test();
		t.mul();
		System.out.println("welcome");
		t.add();
	
	}

}
