import java.util.Scanner;

/**
 * 7)	Consider a CUI based application, 
 * where you are asking a user to enter his Login name and password, 
 * after entering the valid user-id and password it will print the message �Welcome� 
 * along with user name. As per the validation is concerned, the program 
 * should keep a track of login attempts. 
 * After three attempts a message should be flashed saying �Contact Admin� 
 * and the program should terminate. 
 * @author shuraut
 *
 */
public class Authentication {

	
	public static int loginAttemts=0;
	public static final String USER_ID="shuraut";
	public static final String PASSWORD="abc123";
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String userId;
		String password;
			
		while(loginAttemts!=3){
			System.out.println("Enter User Id");
			userId=sc.nextLine();
			System.out.println("Enter Password");
			password=sc.nextLine();

			
			if(checkLoginDetails(userId,password)){
				System.out.println("Welcome");
				break;
			} 
			
		}
		if(loginAttemts==3){
			System.out.println("Contact Admin");
		}
		
	}
	/**
	 * This method checks the login credentials
	 * it returns true if authentication is successful
	 * if returns false if authentication is failed
	 * 
	 * @param userId 
	 * @param password2
	 * @return
	 */
	private static boolean checkLoginDetails(String userId, String password2) {
		if(userId.equals(USER_ID) && password2.equals(PASSWORD)){
			return true;
		}else{
			loginAttemts++;
			return false;
		}
	}

}
