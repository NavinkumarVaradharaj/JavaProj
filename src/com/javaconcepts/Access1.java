package com.javaconcepts;

public class Access1 {
	
	public static void main(String[] args) {
		AccessSpecifierTest a = new AccessSpecifierTest();
		//default method - Within package
		a.studentAddress();
		//protected method - Same package
		a.studentContact();
		//Public method - same package
		a.studentId();
	}

}
