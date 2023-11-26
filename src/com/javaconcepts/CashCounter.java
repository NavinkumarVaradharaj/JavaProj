package com.javaconcepts;

public class CashCounter extends Reliance {
	
	public void perfume() {
		System.out.println("pay by cash");
	}

	@Override
	public void electronics() {
		System.out.println("pay by cash");
	}
	
	public static void main(String[] args) {
		CashCounter c = new CashCounter();
		c.dress();//from parent class
		c.electronics();//from child class
		c.perfume();//from parent class
	}

}
