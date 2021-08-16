package PatientOOP;
import java.util.Scanner;

public class PatientOperation {
	
	
	public void addPatient(Patient patientArray[], Scanner src) {
		
		//Get Array size input from user 
  	    //Scanner src = new Scanner(System.in); 
		
		//populate patient array with information using for loop 
		for(int i = 0; i < patientArray.length; i++) {
		
		//Create object for each location of patient array
		patientArray[i] = new Patient(); 
		
		//Ask user for Patient Information 
		//Ask for Patient ID
		System.out.println("Enter Patient Id: "); 
		int pID = src.nextInt(); 
		
		//Use setter function to set given input into the array 
		patientArray[i].setPatientID(pID);

		
		//Ask for Patient Name 
		System.out.println("Enter Patient Name: "); 
		String pName = src.next(); 
		patientArray[i].setPatientName(pName);
		
		//Ask for Patient Address 
		System.out.println("Enter Patient Address: "); 
		String pAddy = src.next(); 
		patientArray[i].setPatientAddress(pAddy); 
		
		//Ask for Patient Contact 
		System.out.println("Enter Patient Contact: "); 
		long pContact = src.nextLong(); 
		patientArray[i].setPatientContact(pContact);
		
	}
		src.close(); 
		
	}
	
	public void displayPatient(Patient patientArray[]) {
		
		//Print Functions 
		System.out.println("\n Id\t Name\tAddress\tContact"); 
		System.out.println("================================================"); 

		for (int i = 0; i < patientArray.length; i++) { 

		System.out.println(patientArray[i].getPatientID()+"\t"+patientArray[i].getPatientName()+"\t"+patientArray[i].getPatientAddress()+"\t"+patientArray[i].getPatientContact()); 

		}
	}
	
	
	
	

}
