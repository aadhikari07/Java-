import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in); 
		
		System.out.println("Please enter a number: ");
		int num = scr.nextInt(); 
		
		scr.close();
		
		boolean flag = false; //condition equals prime number 
		
		
		//checking for non prime number 
		for(int i=2; i<=num/2; i++) {
			
			
			//NON primenumber condition 
			if (num%i == 0) {
				flag = true; //is not prime 
				break; 
			}
			 
			
			
			
		}
		if(!flag) { //if flag is false then number is prime
			System.out.println(num + "  is a prime number");
			
		}else {
			System.out.println(num + "  is not a prime number");
			
		}
		
		
		
		
		
		
		
		
		

	}

}

