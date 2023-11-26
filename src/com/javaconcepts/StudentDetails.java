package com.javaconcepts;

public class StudentDetails extends Student {
	
	
	public void student() {
		StudentDetails s = new StudentDetails();
		s.student("cs01");
		
		this.student("cs02");
		
		System.out.println("Student");
	}
	

	public void student(String stu_id) {	//String stu_id = "cs01";
		System.out.println("Student Id is "+stu_id);
		this.student();
	}
	
	public void student(String name,int roll_no) {
		String address = "Chennai";
		System.out.println("Student name & roll no are : "+name+" "+roll_no+" "+address);
	}
	
	public static void main(String[] args) {
		StudentDetails s = new StudentDetails();
		s.student();
		
	}
}
