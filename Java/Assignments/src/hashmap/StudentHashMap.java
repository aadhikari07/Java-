package hashmap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class StudentHashMap {

	public static void main(String[] args) {
		
		ArrayList<Student> studentList = new ArrayList<Student>(); 
		
		HashMap<String, ArrayList<Student>> hMap = new HashMap<String, ArrayList<Student>>(); 

		
		Student stud = new Student(); 
		stud.setStudentID(10);
		stud.setStudentName("Tosh");
		stud.setStudentCourse("CS");
		
		studentList.add(stud); 
		

		
		//hMap.put("Boulder University", studentList); 
		
		//System.out.println(hMap);
		
		if(hMap.isEmpty()) {
			System.out.println("Hash Map is empty");
		}else {
			for(Map.Entry<String, ArrayList<Student>> entry : hMap.entrySet() ) {
				//System.out.println(student.getStud +entID() + "\t" + student.getStudentName() + "\t" + student.getStudentCourse());
				System.out.println(entry); 
			
			}
		}
		
		
		
		
		
		
		
	}

}
