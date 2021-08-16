package studentmanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class SchoolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> studentList = new ArrayList<Student>(); 
		Scanner scr = new Scanner(System.in); 
		
		Student.addStudent(studentList,scr);
		Student.seeStudentInfo(studentList, scr);
		
		
		//Student.payFees();

	}

}
