import java.util.Scanner;

//The code below checks for Prime number
//Program/Code is practice for using static method call in main 

public class CheckPrime {
	
	
	public static void isPrime(int num) {
	
	
	boolean flag = false; //If condition is false, the number is prime 
	
	
	//check if number is prime 
	for(int i = 2; i<num/2; i++) {
		
		//NON Prime Number condition 
		if(num%i == 0) {
			flag = true; //condition is true when the number is not prime 
			break; 
		}
	}
	
	
	//if flag is false then number is prime 
	if(!flag) {
		System.out.println( num + " is a prime number!");
	}
	else {
		System.out.println(num + " is NOT a prime number!");  
	}
	 
	} 
	
	

	public static void main(String[] args) {
		
		//Get number from user 
		System.out.println("Please enter a number: ");
		Scanner scr = new Scanner(System.in);
		int num = scr.nextInt(); 
		
		scr.close();
		
		CheckPrime.isPrime(num); //calling with static method 
		//isPrime(num); //both methods work, calling with class name works when the method and main are not in same program 
		
		

	}

}
