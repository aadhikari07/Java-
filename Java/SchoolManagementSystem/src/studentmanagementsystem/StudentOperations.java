package studentmanagementsystem;

import java.util.Scanner;

public class StudentOperations {
	
	public static void payFees() {
		
		int updatedFees = 0; 
		Scanner scr = new Scanner(System.in); 
		
		System.out.println("What ammount would you like to pay: ");
		int ammount = scr.nextInt(); 
		updatedFees = updatedFees + ammount; 

		
		Student student = new Student(); 
	
		
		student.setFeesPaid(updatedFees);
		
		//Print fees 
		System.out.println(student.getFeesPaid()); 
		
		
		scr.close(); 
		
	}
	
	

}
