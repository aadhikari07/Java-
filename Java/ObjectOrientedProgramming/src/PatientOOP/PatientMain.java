package PatientOOP;

import java.util.Scanner;

public class PatientMain {

	public static void main(String[] args) {
		
	//Non-static calling of StudentArray by creating a new instance of the PatientClass as an object (obj1) 
	PatientOperation po1 = new PatientOperation(); 
	
	
	Scanner src = new Scanner(System.in); 
	
	
	System.out.println("Enter array size: "); 
	int size = src.nextInt(); 
	
	//declare array and pass size into it 
	Patient patientArray[] = new Patient[size]; 
	
	po1.addPatient(patientArray,src); //passing the new declared array, and scanner variable from main 
	po1.displayPatient(patientArray); 
		

	}

}
