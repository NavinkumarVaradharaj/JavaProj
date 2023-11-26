package com.javaconcepts1;

import com.javaconcepts.AccessSpecifierTest;

public class Access3 extends AccessSpecifierTest {
	
	public static void main(String[] args) {
		
		a = 200;
		
		AccessSpecifierTest a2 = new AccessSpecifierTest();
		//public method - object for parent class
		a2.studentId();
		
		Access3 a1 = new Access3();
		//protected method - other package with extends & object for child
		a1.studentContact();
		//public method - other package with extends
		a1.studentId();
		
		System.out.println(a);
		
	}

}
