/**
 * 1)	Supple value to function and return the square table that value
Example: - If Supplied value is 5,
Output:  Square: 25

Create the table of 5 and print the square of each number.
Output = 25, 100, 225, 400…2500

	e.g 	5 * 1 = 5 –---------- 25
		5 * 2 = 10----------100
		5 * 3 = 15 ---------225
		.
		.
		.
		5 * 10 = 50 ----------2250

 * @author shuraut
 *
 */
public class SquareTable {

	public static void main(String[] args) {

			
		createTable(5);
		
	}

	private static void createTable(int i) {
		
		for(int j=1;j<=10;j++){
			int result=i*j;
			System.out.println(i+" * "+j+" = "+result+" ------ "+result*result);
		}
//		System.out.println();
	}
	
	
		
}
