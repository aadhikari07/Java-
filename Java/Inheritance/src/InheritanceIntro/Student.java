package InheritanceIntro;

public class Student extends PersonalDetails {
	
	private int studentID;
	private String studentName; 
	private String course;
	
	
	public Student () {
		
		studentName = "N/A"; 
		course = "N/A"; 
	}
	

	public Student(int studentID, String studentName, String course, String lastName, String address, long contactno, String emailID) {
		super(lastName, address, contactno, emailID);
		this.studentID = studentID;
		this.studentName = studentName;
		this.course = course;
	}


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


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	@Override
	public String toString() {
		return super.toString() + "Student [studentID=" + studentID + ", studentName=" + studentName + ", course=" + course + "]";
	}
	
	

	
	
	

}
