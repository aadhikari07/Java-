import java.util.Scanner;

public class AddSingleDigits {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = scr.nextInt(); 
		
		scr.close();
		
		int rem = 0; 
		int sum = 0; 
		
		
		while((num>0)) {
			rem = num%10; //getting reminder to add in next line 
			sum = sum + rem; //calculates the sum each iteration, and updates sum 
			num = num/10; // updates num for each iteration 
			
			
			
		}
		
		System.out.println("Sum of the digits is:  " + sum); 
		
		
		
		
		
		
		
	}

}
