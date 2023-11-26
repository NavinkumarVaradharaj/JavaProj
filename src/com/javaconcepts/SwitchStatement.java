package com.javaconcepts;

public class SwitchStatement {
	
	public static void main(String[] args) {
		int errorcode = 409;
		
		switch(errorcode) {
		case 400 :
			System.out.println("Bad request");
			break;
			
		case 401 :
			System.out.println("UnAuthourized");
			break;
			
		case 403 :
			System.out.println("Forbidden");
			break;
			
		case 404 :
			System.out.println("Not found");
			break;
			
		case 500 :
			System.out.println("Internal Server error");
			break;
			
			default :
				System.out.println("Invalid error code");
				break;
				
			case 501:
				System.out.println("Un processible ");
				break;
			
		}
		
		
		if(errorcode == 400) {
			System.out.println("Bad request");
		}else if(errorcode == 401) {
			System.out.println("Unauthourized");
		}else if(errorcode == 403) {
			System.out.println("forbidden");
		}else if(errorcode == 404) {
			
		}else {
			
		}
		
		
	}

}
