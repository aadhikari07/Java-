import java.util.Scanner;

public class ControlStructuresDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int firstnumber = scr.nextInt();
		
		System.out.println("Enter second number: ");
		int secondnumber = scr.nextInt(); 
		
	
		
		//compare the two numbers
		if(firstnumber == secondnumber) {
			System.out.println("Both numbers are same" + firstnumber + "=" + secondnumber);
		}else if(firstnumber > secondnumber){
			System.out.println("First number is bigger: " + firstnumber);
		}else {
			System.out.println("Second number is bigger: 10" + secondnumber);
		}
		
		scr.close(); 
		

	}

}
