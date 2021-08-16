package EmloyeeOOP;

import java.util.Scanner;

public class EmployeeOperations {
	
public void addEmployee(Employee employeeArray [], Scanner scr) {
	
	
	//Employee e2 = new Employee(); 

	//Using for loop to populate array with employee information 
	for(int i =0; i<employeeArray.length; i++) {
				
	//object creating for each location of Employee array 
	employeeArray[i] = new Employee(); 
				
			
	//Ask info for Employee ID
	System.out.println("Enter Employee ID: ");
	int eID = scr.nextInt(); 
	employeeArray[i].setEmployeeID(eID); //pass received employee ID into employeeArray 
	//e2.setEmployeeID(employeeArray[i]);
			
			
	//Ask info for Employee Name 
	System.out.println("Enter Employee Name: "); 
	String eName = scr.next();
	employeeArray[i].setEmployeeName(eName);
			
	//Ask info for Employee Address 
	System.out.println("Enter Employee Address: ");
	String eAddy = scr.next();
	employeeArray[i].setEmployeeAddress(eAddy);
			
	//Ask info for Employee Contact 
	System.out.println("Enter Employee Contact: "); 
	long cntact = scr.nextLong(); 
	employeeArray[i].setEmployeeContact(cntact);
				
				
			}
	
	
}


public void displayEmployee(Employee employeeArray[]) {
	
	//Print statements to display Employee Information 
	
			System.out.println("\n Id\t Name\tAddress\tContact"); 
			System.out.println("================================================"); 

			for (int i = 0; i < employeeArray.length; i++) { 

			System.out.println(employeeArray[i].getEmployeeID()+"\t"+employeeArray[i].getEmployeeName()+"\t"+employeeArray[i].getEmployeeAddress()+"\t"+employeeArray[i].getEmployeeContact()); 


			} 
	
	
}





}


