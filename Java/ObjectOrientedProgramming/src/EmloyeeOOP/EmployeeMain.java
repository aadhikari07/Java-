package EmloyeeOOP;
import java.util.Scanner;


/* This program adds and displays Employee information using Object Oriented Methods 
 * This program uses constructors 
 
 */ 

public class EmployeeMain {

	public static void main(String[] args) {
		
		
		Scanner scr = new Scanner(System.in);
		
		
		System.out.println("Please Enter Size of Array:  ");
		int size = scr.nextInt(); 
		
		//declare employee array 
		Employee employeeArray[] = new Employee[size]; //passing the received size of array into new employee array 
		
		
		EmployeeOperations eo1 = new EmployeeOperations(); 
		
		eo1.addEmployee(employeeArray,scr); 
		eo1.displayEmployee(employeeArray);
		
		
		
		
		

	}

}
