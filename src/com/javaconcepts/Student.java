package com.javaconcepts;

public class Student {
	
//	public Student() {		//Default Constructor
//		
//	}
	
	public Student(int a,int b) {	//parameterized constructor
		this("qwer");
		
		System.out.println(a+b);
		
	}
	
	public Student() {				//Non-parameterized constructor
		System.out.println("student");
	}
	
	public Student(String name) {
		this();
		System.out.println("Name");
	}
	
	
	public void method1(int aqwer) {
		String s = "qwe";
		System.out.println("method");
	}
	
	
	public static void main(String[] args) {
		Student s = new Student(7,8);
		
		s.method1(9);
		
	}
	

}
