package com.javaconcepts;

public class ExceptionTest {
	
	String s ;
	public void compileTimeException() throws InterruptedException  {
		Thread.sleep(3000);
		System.out.println("Exception");
	}
	
	//Run time Exception
	public void nullPointerExcep() {
		//When we try to use functions for a null value then 
		//NullPointerException will occurs
		System.out.println(s.length());
	}
	
	public void stringIndexOutOfBounds() {
		String name = "Navin";
//		System.out.println(name.charAt(5));
		try {
			System.out.println(name.charAt(2));
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			System.out.println("Finally block");
		}
		
	}
	
	public void arrayIndexOutOfBounds() {
		String names[] = new String[3];
		names[1] = "navin";
		names[3] = "kumar";
	//	System.out.println(names[3]);
		
		for(int i=0;i<=names.length;i++) {
			System.out.println(names[i]);
		}
		
	}
	
	public void arithmeticExcep() {
		int a = 10;
		int b = 0;
		System.out.println(a/b);
	}
	
	public void numberFormat() {
		String s = "Rs.100";
		Integer.parseInt(s);
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		ExceptionTest e = new ExceptionTest();
	//	e.compileTimeException();
	//	e.nullPointerExcep();
		e.stringIndexOutOfBounds();
	//	e.arrayIndexOutOfBounds();
	//	e.arithmeticExcep();
		e.numberFormat();
	}

}
