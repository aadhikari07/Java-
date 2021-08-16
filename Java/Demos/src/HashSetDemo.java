import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

	HashSet <String> hs = new HashSet<String>(); 
	
	//adding to HashSet 
	hs.add("Lion");
	hs.add("Tiger"); 
	hs.add("Bear");
	hs.add("Panther"); 
	hs.add("Monkey"); 
	
	//printing HashSet size 
	System.out.println(hs.size()); 
	//printing HashSet contents 
	System.out.println(hs); 
	
	//removing from HashSet
	hs.remove("Bear"); 
	
	//check if HashSet is empty or not 
	if(hs.isEmpty()) {
		System.out.println("Hash Set is empty!"); 
	} 
		
		
	//Iterating through HashSet 
	Iterator<String> it = hs.iterator(); 
	
	while(it.hasNext()) {
		System.out.println(it.next()); 
	}
		
	
		
		
		
		
	
	
	
	
	
	
		
		
		
		
		
	}

}
