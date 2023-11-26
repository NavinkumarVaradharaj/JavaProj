package com.javaconcepts;

import java.util.Scanner;

public class ScannerTest {
	Scanner sc = new Scanner(System.in);
	//For Primitive
	public void primitiveTest() {
		System.out.println("Enter the age :");
		int age = sc.nextInt();
		System.out.println("The age is : "+age);
	}
	//for character
	public void charTest() {
		System.out.println("Enter a char value : ");
		char c = sc.next().charAt(0);
		System.out.println("The Char value is : "+c);
	}
	//For First word
	public void stringTest() {
		System.out.println("Enter name : ");
		String name = sc.next();
		System.out.println("The Name is : "+name.charAt(4));
	}
	//For entire string
	public void stringTest1() {
		System.out.println("Enter name : ");
		String name = sc.nextLine();
		System.out.println("The Name is : "+name);
	}
	
	public static void main(String[] args) {
		ScannerTest s = new ScannerTest();
		s.stringTest1();
		s.primitiveTest();
		s.charTest();
		s.stringTest();
		
	}

}
