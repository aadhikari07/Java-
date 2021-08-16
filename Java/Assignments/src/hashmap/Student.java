package hashmap;

import java.util.ArrayList;

public class Student {
	
	private int studentID; 
	private String studentName; 
	private String studentCourse; 
	

	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentCourse() {
		return studentCourse;
	}
	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}


	public static void addStudent() {
	
	ArrayList<Student> studentList = new ArrayList<Student>(); 
	
	Student stud = new Student(); //instance of student class 
	
	//adding student information into ArrayList 
	stud.setStudentID(10);
	stud.setStudentName("John");
	stud.setStudentCourse("CS");
	

		
	}
	
	
	
	

}
