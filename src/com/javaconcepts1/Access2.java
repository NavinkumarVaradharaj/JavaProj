package com.javaconcepts1;

import com.javaconcepts.AccessSpecifierTest;

public class Access2 {
	
	public static void main(String[] args) {
		AccessSpecifierTest a = new AccessSpecifierTest();
		//public method - other package without extends
		a.studentId();
	}

}
