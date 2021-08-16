import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample {

	public static void main(String[] args) {
		
		//date class is providing the date information 
		Date dt = new Date(); 
		System.out.println(dt); 
		
		
		
		//date FORMAT is being used to print date/time 
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-YYYY hh:mm:ss a");
		String dateFormat = simpleDateFormat.format(dt); 
		System.out.println(dateFormat); 
		

	}

}
