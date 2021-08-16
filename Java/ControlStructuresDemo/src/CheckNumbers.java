import java.util.Scanner;

public class CheckNumbers {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int firstnumber = scr.nextInt();
		
		System.out.println("Enter second number: ");
		int secondnumber = scr.nextInt(); 
		
		System.out.println("Enter third number: ");
		int thirdnumber = scr.nextInt(); 
		
		scr.close(); //close scanner 
		
		
		//compare the three numbers
		if((firstnumber == secondnumber) && (firstnumber == thirdnumber)) {
			System.out.println("All numbers are same: " + firstnumber + "=" + secondnumber + "=" + thirdnumber);
		}else if((firstnumber > secondnumber) && (firstnumber > thirdnumber)){
			System.out.println("First number is bigger: " + firstnumber);
		}else if((secondnumber > firstnumber) && (secondnumber > thirdnumber)) {
			System.out.println("Second number is bigger: " + secondnumber);
	
		}
		else {
			System.out.println("Third number is bigger: " + thirdnumber);
		}
		
				

	}
	
	
	

}
