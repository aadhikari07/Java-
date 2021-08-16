import java.util.Scanner;

//This program checks the largest number between two numbers 
//This program demonstrates non static method calling in main and class initialization in main  

public class BiggestNumber {
	
	//create non static method to check biggest number 
	public void checkbiggestnumber(int a, int b) {
		
		
		//logic for checking largest number 
		if(a>b) {
			System.out.println( a + "is larger!"); 
		}
		else if(b>a) {
			System.out.println(b + "is larger");
		}
		else {
			System.out.println(a + " and " + b + " are both equal!"); 
		}
		
		
		
		
	}
	

	public static void main(String[] args) {
		
		//Get input from user 
		Scanner scr = new Scanner (System.in);
		
		System.out.println("Enter first number: "); 
		int firstnumber = scr.nextInt(); 
		System.out.println("Enter second number: ");
		int secondnumber = scr.nextInt(); 
		
		scr.close(); 
		
		
		
		//Initialize the class to make object 
		BiggestNumber bn = new BiggestNumber();
		
		//Call BiggestNumber method and pass the user input to them 
		bn.checkbiggestnumber(firstnumber,secondnumber); //non-static method call using object (bn is the object) 
		
		
		
		
		
		
		
		
		
		

	}

}
