package hashmap;
import java.util.ArrayList;
import java.util.HashMap;

public class StudentHashMap2 {

	public static void main(String[] args) {

		ArrayList<Student> studentList = new ArrayList<Student>(); 

		HashMap<String, ArrayList<Student>> hMap = new HashMap<String, ArrayList<Student>>(); 
		
		studentList.add("Student Id", 20); 
		
		hMap.put(null, studentList); 
		
		
		
	}

}
