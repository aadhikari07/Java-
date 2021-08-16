
public class StarPattern {

	public static void main(String[] args) {
		
		
		//i for rows, and j for the number of stars being printed  
		int i,j; 
		//size is the number of rows that you want to print 
		int size = 8; 
		
		//printing star pattern with for loops 
		for(i = 0; i<size; i++) { //prints rows, and iterates "size times" however many rows 
			
			//2nd nested for loop
			for(j=0; j<=i; j++) { //j prints the number of stars depending on the row(i), so if i is 0 then 1 star is printed 
				
				System.out.print("* "); //prints star 
						
			}
			
			System.out.println(); //printing or starting new line 
			
			
		}
		
		
		
		
	} 	

}
