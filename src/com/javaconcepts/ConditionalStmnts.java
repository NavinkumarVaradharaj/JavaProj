package com.javaconcepts;

public class ConditionalStmnts {
	
	public void ifTest() {
		int age = 99;
		
		if((age >= 18) && (age <= 100)) {
			System.out.println("Major");
		}else if((age >=1)&&(age<=17)){
			System.out.println("Minor");
		}else {
			System.out.println("Invalid age");
		}
	}
	
	public static void main(String[] args) {
		ConditionalStmnts c = new ConditionalStmnts();
		c.ifTest();
	}

}


//1 to 5 --> child
//6 t0 17 --> minor
//18 to 59 --> Major
//60 to 100 --> Senior citizen
//others --> Invalid age