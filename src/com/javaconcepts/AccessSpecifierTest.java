package com.javaconcepts;

public class AccessSpecifierTest {
	
	public static int a = 100;
	private static String name = "Navin";
	protected static double d = 23424.34;
	static boolean b = true;
	
	public int studentId() {
		int x = 20;
		System.out.println("public method");
		return x;
	}
	
	private void studentName() {
		System.out.println("private Method");
	}
	
	protected void studentContact() {
		System.out.println("Protected Method");
	}
	
	void studentAddress() {
		System.out.println("Default method");
	}
	
	public static void main(String[] args) {
		AccessSpecifierTest a = new AccessSpecifierTest();
		a.studentAddress();
		a.studentContact();
		a.studentName();
		a.studentId();
		
		System.out.println(name);
		
	}

}
