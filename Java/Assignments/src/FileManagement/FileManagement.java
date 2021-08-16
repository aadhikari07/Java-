package FileManagement;
import java.io.*;
import java.io.FileNotFoundException;

public class FileManagement {
	
public static void fileManagement() {
		
		try {
			
			FileInputStream fs = new FileInputStream("/Users/ashutosh.adhikari/Desktop/Java/Assignments/src/FileManagement/file1.txt");
			FileOutputStream os = new FileOutputStream("/Users/ashutosh.adhikari/Desktop/Java/Assignments/src/FileManagement/file3.txt"); 
		
			
			int byteValue; 
			while((byteValue = fs.read()) != -1) {
			os.write(byteValue);
			}
			fs.close(); 
			os.close(); 
			
			System.out.println("File done!"); 
			
		}
	
		catch (FileNotFoundException e) {
			e.printStackTrace(); 	
		}
		catch (IOException e) {
			e.printStackTrace(); 
		}
	
		

	}

public static void readFile() {
	
	FileReader fr = null; 
	
	try {
		
		fr = new FileReader("/Users/ashutosh.adhikari/Desktop/Java/Assignments/src/FileManagement/file2.txt"); 
		int i; 
		
		while((i = fr.read()) != -1) {
			System.out.println((char)i); 
		}
		fr.close(); 
	}
	catch (FileNotFoundException e) {
		e.printStackTrace(); 	
	}
	catch (IOException e) {
		e.printStackTrace(); 
	}	
	
}
	
	
	

	public static void main(String[] args) {
		
		
		fileManagement(); 
		readFile(); 

}
} 
