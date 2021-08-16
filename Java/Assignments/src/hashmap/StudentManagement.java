package hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import schoolmanagement.Student;
import schoolmanagement.studentSort;

public class StudentManagement {
	
public static void studentMenu() {
		
		Scanner scr = new Scanner(System.in); //setting up scanner for user input 
		
		ArrayList<Student> studentList = new ArrayList<Student>(); //initializing student array list  
		
		int choice; //variable for user menu choice 
		
		do {
		//Student Menu
		System.out.println("\nManage Student Information");
		System.out.println("\n1  Add student");
		System.out.println("2. Show all students"); 
		System.out.println("3. Search for student"); 
		System.out.println("4. Update student information"); 
		System.out.println("5. Delete student information");
		System.out.println("6. Sort student information"); 
		System.out.println("7. EXIT"); 
		System.out.println("\nEnter your choice: "); 
		
		choice = scr.nextInt(); //choice input 
		
		//Switch case statement for user choice 
		
		switch(choice) {
		
		case 1: StudentManagement.addStudent(studentList, scr);
			break; 
		case 2: StudentManagement.displayStudent(studentList,scr);
			break; 
		case 3: StudentManagement.searchStudent(studentList, scr);
			break; 
		case 4: StudentManagement.updateStudent(studentList, scr);
			break; 
		case 5: StudentManagement.deleteStudent(studentList, scr);
			break; 
		case 6: StudentManagement.studentSort(studentList); 
			break; 
		default: if(choice != 8) {
			System.out.println("Invalid Choice! Try Again!"); 
		}
		
			
		}
		
		
		}
		
		while (choice !=7);  //close menu if choice is not 7 
		
		
		scr.close(); 
		
	}
	
	
	
	public static void addStudent(ArrayList<Student> studentList, Scanner scr) {
		
		
		System.out.println("Enter Student ID: ");
		int sID = scr.nextInt(); 
		
		System.out.println("Enter Student Name: "); 
		String sName = scr.next(); 
		
		System.out.println("Enter Student Course: "); 
		String sCourse = scr.next(); 
		
		//Set student info student object 
		Student stud = new Student(); //initiating the object 
		stud.setStudentID(sID);
		stud.setStudentName(sName);
		stud.setStudentCourse(sCourse);
		
		studentList.add(stud); 
					
	}
	
	private static void format() {
		
		System.out.println("Student Id\tStudent Name\tStudent Course"); 
		System.out.println("================================================"); 
	}
	
	public static void displayStudent(ArrayList<Student> studentList, Scanner scr) {
		
		if(studentList.isEmpty()) {
			System.out.println("Student list is empty!"); 
		}
		format(); 
		for(Student student : studentList) {
			System.out.println(student.getStudentID()+ "\t" + "\t" + student.getStudentName() + "\t" + "\t" + student.getStudentCourse()); 
		}
			
		
	}
	
	
public static void searchStudent(ArrayList <Student> studentList, Scanner scr) {
	System.out.println("Enter Student ID for search: "); 
	int sID = scr.nextInt(); 
	
	if(studentList.isEmpty()) {
		System.out.println("Student list is empty!"); 
	}
	else {
		for(Student student : studentList) {
			if(student.getStudentID() == sID) {
				format(); 
				System.out.println(student.getStudentID()+ "\t" + student.getStudentName() + "\t" + student.getStudentCourse());
			}
				
		}
	}
	
}
	
public static void updateStudent(ArrayList <Student> studentList, Scanner scr) {
		
		boolean status = false; 
		
		if(studentList.isEmpty()) {
			System.out.println("Student list is empty");
		}else {
			
			System.out.println("\n What would you like to update: ");
			System.out.println("1. Student ID"); 
			System.out.println("2. Student Name"); 
			System.out.println("3. Student Course");
			
			int choice = scr.nextInt(); 
			
			switch(choice) {
			
			case 1: 
				System.out.println("Enter Student ID: ");
				int sID = scr.nextInt(); 
				for(Student student : studentList) {
					if(student.getStudentID() == sID) { 
						student.setStudentID(sID);
						status = true;	  
					}
				break; 
				}
			
			case 2: 
				System.out.println("Enter Student ID: "); 
				int sID2 = scr.nextInt(); 
				for(Student student : studentList) {
				if(student.getStudentID() == sID2) {
					
					System.out.println("Enter new name: ");
					String studentName = scr.next();
					
				student.setStudentName(studentName);
				status = true; 
				}
				break; 
				} 
				
				
				case 3: 
				System.out.println("Enter Student Id: "); 
				int sID3 = scr.nextInt(); 
				for(Student student : studentList) {
					if(student.getStudentID() == sID3) {
						System.out.println("Enter new course: ");
						String course = scr.next(); 
						student.setStudentCourse(course);
						status = true; 
					}
					break; 
				}
				
					
					
				
			
			} //switch closed	
			
			if(!status) {
				System.out.println("No records found with the provided Student ID ");
			}
			
			
		} //else closed 
			
	} //Student update closed  
	

	public static void deleteStudent(ArrayList<Student> studentList, Scanner src) {
		
		//get student id 
		System.out.println("Enter Student ID: "); 
		int sID = src.nextInt(); 
		
		boolean status = false; 
		
		if(studentList.isEmpty()) {
			System.out.println("Student list is empty!"); 
			
		}
		else {
			for(Student student : studentList) {
				
				if(student.getStudentID() == sID) {
					studentList.remove(student); 
					status = true; 
					break; 
				}
				
				
			}
		
		}if(!status) {
			System.out.println("No records found with provided Student Id: " + sID); 
		}
		
		
		
		
	}
		
	public static void studentSort(ArrayList <Student> studentList) {
		Collections.sort(studentList, new studentSort());
	}


}
