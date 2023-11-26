package com.javaconcepts;

public class LoopStatements {
	
	String s1 ;
	int a;
	
	public void forTest() {
		
		String s = "abc";
		
		System.out.println(s1);
		System.out.println(a);
		for(int i =100;i<=10;i++) {
			System.out.println("Navin "+i);
		}
		
		for(int i =10;i>=1;i--) {
			LoopStatements l = new LoopStatements();
			l.whileTest();
		}
	}
	
	public void whileTest() {
		
		//While loop
		int i = 10;
				
		while(i>0) {
			System.out.print(i+" ");
			i--;
		}
		
		int j=100;
		while(j<=5) {
			j++;
			System.out.println(j);
		}
		
		//do-while loop
		int k=100;
		do {
			System.out.println(k);
			k++; 
		}while(k<=5);  
		
		
		
	}
	
	public static void main(String[] args) {
		LoopStatements l = new LoopStatements();
		
		l.whileTest();
	}

}


//Navin 1
//Navin 2


//Navin 10


//10 Navin
//9 Navin
// 8 Navin

//1 Navin