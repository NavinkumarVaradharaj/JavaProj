package com.javaconcepts;

public class MultiLevelTest extends SingleInheritance {

	public void studentMarks() {
		System.out.println("Method from multi level");
	}
	
	public static void main(String[] args) {
		MultiLevelTest m = new MultiLevelTest();
		m.studentAddress();//Grand parent
		m.studentContact();//Grand parent
		m.studentDetails();//parent
		m.studentId();//Grand parent
		m.studentMarks();//current class
		
	}
}
