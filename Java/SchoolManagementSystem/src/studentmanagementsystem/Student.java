package studentmanagementsystem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

//import schoolmanagement.Student;

/**
*
* The method is responsible for keeping track of student information.
* Student information such as, students fees, name, grade, and fees paid. 
*
*/


public class Student {
	
	private int studentId; 
	private String studentName; 
	private int studentGrade; 
	private int feesPaid; 
	private int feesTotal; 
	

	//Default Constructor initializing a new student
	public  Student() {
		studentName = "N/A"; 
		feesPaid = 0;
		feesTotal = 30000; 
		
	}

	//Paramitized Constructor initializing 
	public Student(int studentId, String studentName, int studentGrade, int feesPaid, int feesTotal) {
		//super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentGrade = studentGrade;
		this.feesPaid = feesPaid;
		this.feesTotal = feesTotal;
	}
	
	//Setters & Getters 
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentGrade() {
		return studentGrade;
	}

	public void setStudentGrade(int studentGrade) {
		this.studentGrade = studentGrade;
	}

	public int getFeesPaid() {
		return feesPaid;
	}

	public void setFeesPaid(int feesPaid) {
		this.feesPaid = feesPaid;
	}

	public int getFeesTotal() {
		return feesTotal;
	}

	public void setFeesTotal(int feesTotal) {
		this.feesTotal = feesTotal;
	}
	
	
	
	public static void addStudent(ArrayList<Student> studentList, Scanner scr) {
		
		//Student student = new Student(); 
		
		System.out.println("Enter Student Name: ");
		String sName = scr.next(); 
		
		System.out.println("Enter Student ID: "); 
		int sID = scr.nextInt();
	
		
		student.setStudentName(sName);
		student.setStudentId(sID);

		
		studentList.add(student); 	
		
		
	}
	
	public static void seeStudentInfo(ArrayList<Student> studentList, Scanner scr) {
		
		Student student = new Student(); 
		
		System.out.println("\nView Student Information"); 
		System.out.println("Enter Student Id: "); 
		int sID = scr.nextInt(); 
		
		for(Student stud : studentList) {
			
			if(stud.getStudentId() == sID) {
				format(); 
				System.out.println(student.getStudentId()+ "\t" + "\t" + student.getStudentName());
			}
		}
	}
		
	 private static void format() {
				
				System.out.println("Student Id\tStudent Name\tStudent Course"); 
				System.out.println("================================================"); 
				
			}
		
		
	 public static void displayStudent() {
			
			ArrayList <Student> studentList = new ArrayList<Student>(); 
			
				
				if(studentList.isEmpty()) {
					System.out.println("Student list is empty!"); 
				}
				format(); 
				for(Student student : studentList) {
					System.out.println(student.getStudentId()+ "\t" + "\t" + student.getStudentName()); 
				}
					
				
			}
	
	

	public static void payFees() {
		
		int updatedFees = 0; 
		Scanner scr = new Scanner(System.in); 
		
		System.out.println("What ammount would you like to pay: ");
		int ammount = scr.nextInt(); 
		updatedFees = updatedFees + ammount; 

		
		Student student = new Student(); 
	
	
		student.setFeesPaid(updatedFees);
		
		//Print fees 
		System.out.println(student.getFeesPaid()); 
		
		
		scr.close(); 
		
	}
	

	
	
	
	
	
	

}
