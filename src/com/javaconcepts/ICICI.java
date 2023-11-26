package com.javaconcepts;

public class ICICI implements GooglePay,Phonepe {

	@Override
	public void billPayment() {
		System.out.println("ICICI bill payment");
	}

	@Override
	public void transfer() {
		System.out.println("ICICI Transfer");
	}

	@Override
	public void payment() {
		System.out.println("ICICI payment");
	}

	
	public static void main(String[] args) {
		ICICI i = new ICICI();
		
		
		
		Phonepe p = new ICICI();
		p.transfer();
	}
}
