package schoolmanagement;

public class Student {
	
	private int StudentID; 
	private String StudentName; 
	private String StudentCourse;
	
	
	public Student() {
		StudentName = "N/A"; 
		StudentCourse = "N/A"; 
	}
	
	
	public int getStudentID() {
		return StudentID;
	}
	public void setStudentID(int studentID) {
		StudentID = studentID;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentCourse() {
		return StudentCourse;
	}
	public void setStudentCourse(String studentCourse) {
		StudentCourse = studentCourse;
	} 
	
	
	
	
	
	
	
	
	

}
