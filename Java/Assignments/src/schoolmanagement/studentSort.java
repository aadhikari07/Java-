package schoolmanagement;

import java.util.Comparator;

public class studentSort implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {

		return(s1.getStudentID() - s2.getStudentID()); 
		
		//if it returns negative value, then its sorted in ascending order 
		//if it returns positive value, then its sorted in descending order
		//if it returns zero, its the same order 

	}

}
