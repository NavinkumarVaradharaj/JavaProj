package com.javaconcepts;

public class StringTest {

	public static void main(String[] args) {
		String s = "James Gosling";
		String s1 = "James gosling Java";
		String s2 = "  James gosling   ";
		
		int length = s.length();
		System.out.println(length);
	
		String concat = s.concat(" Java");
		System.out.println(concat);
		
		boolean equals = s.equals(s1);
		System.out.println(equals);
		
		boolean equalsIgnoreCase = s1.equalsIgnoreCase(concat);
		System.out.println(equalsIgnoreCase);
	
		int indexOf = s.indexOf('s');
		System.out.println(indexOf);
		
		int lastIndexOf = s.lastIndexOf('s');
		System.out.println(lastIndexOf);
		
		char charAt = s1.charAt(15);
		System.out.println(charAt);
		
		boolean startsWith = s.startsWith("Ja");
		System.out.println(startsWith);
		
		boolean endsWith = s1.endsWith("ava");
		System.out.println(endsWith);
		
		boolean contains = s1.contains("ling");
		System.out.println(contains);
		
		System.out.println(s2);
		String trim = s2.trim();
		System.out.println(trim);
		
		String replace = s1.replace("am", "em");
		System.out.println(replace);
		
		String substring = s.substring(3, 11);
		System.out.println(substring);
		
		String[] split = s1.split(" ");
		for(int i=0;i<split.length;i++) {
			System.out.println(split[i]);
		}
		
		
		
	
	}
}


//ctrl+2,l


