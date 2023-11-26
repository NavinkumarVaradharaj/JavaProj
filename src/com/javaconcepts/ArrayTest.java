package com.javaconcepts;

public class ArrayTest {
	
	public void arrTest() {
		int marks[] = new int[20];
		
		marks[4] = 45;
		marks[3] = 46;
		marks[7] = 48;
		marks[5] = 23;
		marks[0] = 45;
		marks[5] = 67;
		marks[5] = 45;
		marks[12] = 34;
		
		System.out.println(marks[8]);
		
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		
		String city[] = new String[10];

		city[0] = "Chennai";
		city[1] = "Salem";
		city[7] = "Madurai";
		city[3] = "Kovai";
		city[9] = "Nellai";
		city[7] = "Kanyakumari";
		
		for(int i=5;i<city.length;i++) {
			System.out.println(city[i]);
		}
		System.out.println("=====================================");
		for(String s : city) {
			System.out.println(s);
		}
		
		System.out.println("=========================");
		for(int a : marks) {
			System.out.println(a);
		}
		
		
		
	}
	
	public static void main(String[] args) {
		ArrayTest ar = new ArrayTest();
		ar.arrTest();
	}

}
