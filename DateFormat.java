
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Take complete date from the user in the form of (DD,MM,YYYY) and Display the date in the form given below:
	DD/Month-Name/YYYY
	Example: - Input 09,07,2010 
	Output: -09/July/2010

 * @author shuraut
 *
 */
public class DateFormat {

	public static void main(String[] args) throws ParseException {

		Scanner sc=new Scanner(System.in);

		
		String date;
		System.out.println("Please enter the date in format dd,mm,yyyy");
		date=sc.nextLine();
		
		System.out.println(convertDate(date));
		
	}

	private static String convertDate(String date) throws ParseException {
		String pattern = "dd,mm,yyyy";
		SimpleDateFormat originalFormat = new SimpleDateFormat(pattern);
		SimpleDateFormat requiredFormat = new SimpleDateFormat("dd/MMM/yyyy");
		return requiredFormat.format(originalFormat.parse(date));

	}
	
	

}
