import java.util.Scanner;

/**
 * 4)	Provide  marks of three subject and declare the result, 
 * result declaration is based on  below conditions:
 * Condition 1: -All subjects marks is greater than 60 is Passed
 * Condition 2: -Any two subjects marks is greater than 60 is Promoted
 * Condition 3: -Any one subject marks is greater than 60 or all subjects’ 
 * marks less than 60 is failed.

 * @author shuraut
 *
 */
public class ResultDeclaration {

	
	public static void main(String[] args) {

		int english;
		int science;
		int maths;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter marks in English");
		english= sc.nextInt();
		
		System.out.println("Enter marks in Science");
		science= sc.nextInt();
		
		System.out.println("Enter marks in Maths");
		maths= sc.nextInt();

		int count =0;
		if(english>=60){
			count++;
		}
		if(science>=60){
			count++;
		}
		if(maths>=60){
			count++;
		}

		switch(count){
		case 3:
			System.out.println("Passed");
			break;
		case 2:
			System.out.println("Promoted");
			break;
		default:
			System.out.println("Failed");
			break;
			}
	}



}
