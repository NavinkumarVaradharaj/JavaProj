package com.javaconcepts1;

public class AB {
	
	public void setup(Browsers browserName) {
		if(browserName == Browsers.CHROME) {
			System.out.println("Chrome browser");
		}
	}
	
	static public void main(String[] args) throws Exception {
		age();
		System.out.println("M"+'O'+'M');
	}
	
	
	
	public static void age() throws Exception {
		int age = 30;
		String email = "asd.gmail.com";
		if(!(email.contains("gmail.com"))||(email.contains("outlook.com"))) {
			throw new InvalidEmailException("Invalid email");
		}else {
			System.out.println("valid email");
		}
	}

}
