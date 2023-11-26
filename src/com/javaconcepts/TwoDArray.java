package com.javaconcepts;

public class TwoDArray {
	
	public void arr2D() {
		String arr[][] = new String[5][2];

		arr[0][0] = "James";
		arr[0][1] = "Gosling";
		arr[2][1] = "Jason";
		arr[4][1] = "Huggins";
		
		System.out.println(arr[3][0]);

		//Iterating the number of rows
		for(int i=0;i<arr.length;i++) {	
			//Iterating the number of columns for the ith row
			for(int j=0; j<arr[i].length;j++) {
				//Print values of each row
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("*************************");
		//For iterating row
		for(String[] s : arr ) {
			//for iterating columns
			for(String s1 : s) {
				System.out.print(s1+" ");
			}
			System.out.println();
		}
		
			
	}
	
	public static void main(String[] args) {
		TwoDArray t = new TwoDArray();
		t.arr2D();
	}

}
