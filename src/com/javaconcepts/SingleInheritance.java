package com.javaconcepts;

public class SingleInheritance extends AccessSpecifierTest {
	
	public void studentDetails() {
		System.out.println("Single Inher method");
	}
	
	public static void main(String[] args) {
		SingleInheritance s = new SingleInheritance();
		s.studentAddress();//parent
		s.studentContact();//parent
		s.studentDetails();
		s.studentId();//parent
	}

}
