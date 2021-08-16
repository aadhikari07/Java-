package InheritanceIntro;

public class ConstructorInheritance {
	
	public static void main (String[] args) {
		
		Student s1 = new Student(); 
		
		//System.out.println(s1.getStudentID()+ "\t" + s1.getStudentName() + "\t" + s1.getLastName() + "\t" + s1.getAddress() + "\t" + s1.getCourse() + "\t" + s1.getEmailID());
		
		Student s2 = new Student(10,"Ashutosh","Java","Adhikari","CO", 123, "ashutosh.adhikari@gmail.com"); 
		
		//System.out.println(s2.getStudentID()+ "\t" + s2.getStudentName() + "\t" + s2.getLastName() + "\t" + s2.getAddress() + "\t" + s2.getCourse() + "\t" + s2.getEmailID());

		
		//Printing with toString() method
		//Printing with toString() helps differentiate parent and child class names 
		System.out.println(s1.toString()); 
		System.out.println(s2.toString()); 
		
	}

}
