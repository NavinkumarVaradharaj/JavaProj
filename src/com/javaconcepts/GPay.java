package com.javaconcepts;

public class GPay extends Payment {
	
	//To denotes this method is overridden from the parent class
	@Override
	public void pay(int amount) {
		
		//Calling parent class method using super keyword
		super.pay(7000);
		
		amount = amount - 100;
		System.out.println("Paid amount : "+amount);
	}
	
	public static void main(String[] args) {
		GPay g = new GPay();
		g.pay(5000);
		
		
		//Object for parent class
		Payment p = new Payment();
		//Calling parent class method using parent object
		p.pay(5000);
	}

}
