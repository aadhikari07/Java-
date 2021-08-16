package StudentOOP;
import java.util.Scanner;

//This program collects Student information like StudentID,Address,Name, contact 
//This program has non-static method calling functionality 


public class StudentClassArray {
	
public void StudentArray() {
		
	//Get Array size input from user 
	Scanner scr = new Scanner(System.in); 
	
	System.out.println("Enter Array size:  "); 
	int size = scr.nextInt(); 
	
	//declare array and pass size into it 
	Student studentArray[] = new Student[size]; 
	
	//Populate student array with information 
	for(int i = 0; i<studentArray.length; i++) {
		
	//object creating for each location of student array 
	studentArray[i] = new Student(); 
		
	
	//Ask user for Student Information 
	//Ask for Student ID 
	System.out.println("Enter Student ID: ");
	int sID = scr.nextInt();
	
	//Use setter function to set given input into the array 
	studentArray[i].setStudentId(sID);
	
	//Ask for Student Name 
	System.out.println("Enter Student name: ");
	String sName = scr.next(); 
	studentArray[i].setStudentName(sName);
	
	//Ask for Student Address 
	System.out.println("Enter Student address: "); 
	String sAddy = scr.next();
	studentArray[i].setStudentAddress(sAddy);
	
	//TODO: Ask for Student Contact
	System.out.println("Enter Student Contact: ");
	long sContact = scr.nextLong(); 
	studentArray[i].setStudentContact(sContact);
	
		
		
		
	}
	
	System.out.println("\n Id\t Name\tAddress\tContact"); 
	System.out.println("================================================"); 

	for (int i = 0; i < studentArray.length; i++) { 

	System.out.println(studentArray[i].getStudentId()+"\t"+studentArray[i].getStudentName()+"\t"+studentArray[i].getStudentAddress()+"\t"+studentArray[i].getStudentContact()); 


	}
	
	scr.close(); //close Scanner

	
			
			
}			
			
	

	public static void main(String[] args) {
		
		
		//Non-static calling of StudentArray by creating an instance of StudentClassArray as an object (obj1) 
		//creating an instance of the class 
		StudentClassArray obj1 = new StudentClassArray(); 
		
		//call EmployeeArray method 
		obj1.StudentArray();
		
		

	}

}
