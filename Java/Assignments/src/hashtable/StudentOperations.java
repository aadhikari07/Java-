package hashtable; 
import java.util.HashSet;
import java.util.Scanner;

import schoolmanagement.Student;

public class StudentOperations {
	
//////////////////////////////////
	//Student Menu//
//////////////////////////////////
	
	public static void studentMenu() {
		
		Scanner scr = new Scanner(System.in);
		
		HashSet <Student> studentList = new HashSet<Student> (); 
		
		int choice;  
		
		do {
			
			System.out.println("\nManage Student Information");
			System.out.println("\n1  Add student");
			System.out.println("2. Show all students"); 
			System.out.println("3. Search for student"); 
			System.out.println("4. Update student information"); 
			System.out.println("5. Delete student information");
			System.out.println("6. EXIT"); 
			System.out.println("\nEnter your choice: "); 
			
			choice = scr.nextInt(); //choice input 
			
			switch(choice) {
			
			case 1: StudentOperations.addStudent(studentList, scr);
				break; 
			case 2: StudentOperations.displayStudent(studentList, scr);
				break;
			case 3: StudentOperations.searchStudent(studentList, scr); 
				break; 
			case 4: StudentOperations.updateStudent(studentList, scr);
				break; 
			case 5: StudentOperations.deleteStudent(studentList, scr);
				break; 
			default: if(choice !=8 ){
				
				System.out.println("Invalid Choice! Try again!"); 
			}
			
			
		}
		}
		while(choice  !=6); 
		
		scr.close(); 
		
		
	}

//////////////////////////////////
	   //Add STUDENT//
//////////////////////////////////
	
 public static void addStudent(HashSet <Student> studentList, Scanner scr) {
	 
	 System.out.println("Enter Student Id: ");
	 int sID = scr.nextInt();
	 
	 System.out.println("Enter Student Name: ");
	 String sName = scr.next(); 
	 
	 System.out.println("Enter Student Course: "); 
	 String sCourse = scr.next(); 
	
	 
	 
	//User setter method to add student information
	Student stud = new Student(); 
	stud.setStudentID(sID);
	stud.setStudentName(sName);
	stud.setStudentCourse(sCourse);
	
	studentList.add(stud); 
	 
 }
 
//////////////////////////////////
 		//Format//
//////////////////////////////////
 
 private static void format() {
		
		System.out.println("Student Id\tStudent Name\tStudent Course"); 
		System.out.println("================================================"); 
	}

//////////////////////////////////
 		//Display Student//
//////////////////////////////////
	
public static void displayStudent(HashSet <Student> studentList, Scanner scr) {
	
//	HashSet <Student> studentList = new HashSet<Student> studentList(); 
//	Scanner scr = new Scanner(System.in);  
		
		if(studentList.isEmpty()) {
			System.out.println("Student list is empty!"); 
		}
		format(); 
		for(Student student : studentList) {
			System.out.println(student.getStudentID()+ "\t" + "\t" + student.getStudentName() + "\t" + "\t" + student.getStudentCourse()); 
		}
			
		
	}

//////////////////////////////////
	//Search Student//
//////////////////////////////////

public static void searchStudent(HashSet <Student> studentList, Scanner scr) {
	
	//studentList = new HashSet<Student>(); 
	
	System.out.println("Enter Student ID to search: ");
	int sID = scr.nextInt(); 

	//check if student list is empty 
	if(studentList.isEmpty()) {
		System.out.println("Student List is empty!");
		
	}else {
		
		for(Student student : studentList) {
			if(student.getStudentID() == sID) {
				
			
			format();
		   System.out.println(student.getStudentID()+ "\t" + "\t" + student.getStudentName() + "\t" + "\t" + student.getStudentCourse()); 

				
				
		}
		
		
	}
	
	
	
}
	


} //search student closed


//////////////////////////////////
	//Update Student//
//////////////////////////////////

public static void updateStudent(HashSet <Student> studentList, Scanner scr) {
	
	System.out.println("Enter Student ID to update: ");
	int sID = scr.nextInt();
	
	boolean status = false; 
	
	if(studentList.isEmpty()) {
	System.out.println("Student list is empty!");
	}
	else {
		for(Student student : studentList) {
			if(student.getStudentID() == sID) {
				System.out.println("Enter new Student ID: ");
				int sID2 = scr.nextInt(); 
				student.setStudentID(sID2);
				status = true; 
				
			}
		}
		if(!status) {
			System.out.println("No records found with the provided Student ID!"); 
		}
	}
	
	
	
	
}

//////////////////////////////////
	//Delete Student//
//////////////////////////////////

public static void deleteStudent(HashSet <Student> studentList, Scanner scr) {
	
	System.out.println("Enter Student ID to delete: ");
	int sID = scr.nextInt();
	
	boolean status = false; 
	
	if(studentList.isEmpty()) {
		System.out.println("Student list is empty"); 
	}
	else {
		for(Student student : studentList) {
			if(student.getStudentID() == sID) {
				
				studentList.remove(student); 
				status = true; 
				
				
			}
		}
	if(!status) {
		System.out.println("No records found with the provided Student ID!"); 
	}
	}
	
	
}



}
