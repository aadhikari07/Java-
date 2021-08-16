import java.util.Scanner;

public class InputCommandLine {

	public static void main(String[] args) {


	//int a = Integer.parseIntarg([0]) //commandline input 
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int number = scr.nextInt(); //nextINT takes the next token of the input coming from src as input
		
		String result = number%2 == 0 ? "Even" : "Odd"; 
		
		System.out.println(number + "is" + result);
				
		
		
		
		
	}

}
