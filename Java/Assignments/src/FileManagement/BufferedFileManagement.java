package FileManagement;
import java.io.*; 

public class BufferedFileManagement {
	
	public static void fileManagement() {
		
		BufferedReader bufferedReader = null; 
		BufferedWriter bufferedWriter = null; 
		
		try {
			bufferedReader  = new BufferedReader((new FileReader("/Users/ashutosh.adhikari/Desktop/Java/Assignments/src/FileManagement/file1.txt"))); 
			bufferedWriter = new BufferedWriter((new FileWriter("/Users/ashutosh.adhikari/Desktop/Java/Assignments/src/FileManagement/file3.txt"))); 
			
		String line; 
		
		while((line = bufferedReader.readLine()) != null) {
			bufferedWriter.write(line);
			bufferedWriter.newLine(); 
			//System.out.println(line); 
			
		}
		
	System.out.println("File has been written!"); 

		
	}
		
	catch (FileNotFoundException e) {
			e.printStackTrace(); 	
			}
	catch (IOException e) {
			e.printStackTrace(); 
			}
	
	}
	
	
	
	public static void readFile() {
	
	BufferedReader bufferedReader = null; //initializing the buffered reader 
	
	
	try {
		bufferedReader  = new BufferedReader((new FileReader("/Users/ashutosh.adhikari/Desktop/Java/Assignments/src/FileManagement/file3.txt"))); 
		String line; 
		while((line = bufferedReader.readLine()) != null) {
			System.out.println(line); 
		} 	
		
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
