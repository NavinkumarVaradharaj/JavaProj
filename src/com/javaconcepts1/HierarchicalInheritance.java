package com.javaconcepts1;

import com.javaconcepts.AccessSpecifierTest;

public class HierarchicalInheritance extends AccessSpecifierTest {

	public void studentAge() {
		System.out.println("hier method");
	}
	public static void main(String[] args) {
		HierarchicalInheritance h = new HierarchicalInheritance();
		h.studentContact();
		h.studentAge();
		h.studentId();
	}
}
