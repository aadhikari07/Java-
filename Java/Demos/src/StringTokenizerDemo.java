import java.util.StringTokenizer;
//StringTokenizer is used to split strings based on different tokens such as 
// commas, semicolons or other similar patterns 

public class StringTokenizerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String emailIDs = "abc@gmail.com;sam@gmail.com;xyz@gmail;krish@gmail;shiva@gmail.com"; 
//		
		
		//Split feature only splits based on one given pattern, not multiple
//		String emailArray [] = emailIDs.split(";");
//		
//		for(String email : emailArray) {
//			
//			System.out.println(email); 
//		}
//		
		
		
		//divides or splits strings best on "," or ";"
		StringTokenizer tokenizer =  new StringTokenizer(emailIDs, ",;"); 
		
		
		while(tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken()); 
		}

	}

}

