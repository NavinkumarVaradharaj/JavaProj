package com.javaconcepts;

public class SBI implements GooglePay,Phonepe{

	@Override
	public void billPayment() {
		System.out.println("bill payment");
	}

	@Override
	public void transfer() {
		System.out.println("transfer");
	}

	@Override
	public void payment() {
		System.out.println("payment");
	}

	
	public static void main(String[] args) {
		SBI s = new SBI();
		s.transfer();
		
		Phonepe p = new SBI();	//Upcasting
		
		GooglePay g = new SBI();	//Upcasting
		
		p.transfer();
		
		
		
	}
}
