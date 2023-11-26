package com.javaconcepts;

public class Payment {
	
	public void pay(int amount) {
		System.out.println("Paid amount : "+ amount);
	}
	
	public void transfer(int amount) {
		System.out.println("transfer");
	}
	
	
	public static void main(String[] args) {
		Payment p = new Payment();
		p.pay(900);
		p.transfer(789);
	}

}
