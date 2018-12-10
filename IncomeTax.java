import java.util.Scanner;

/**
 * 5)	Calculate the income tax on the basis of following  table.
		Note:-Assume slab is consider for Male, Female as well as Senior citizen
		Slab	Income Range	Tax payable in Percentage
		Slab A	0-1,80,000			Nil
		Slab B	1,81,001-3,00,000	10%
		Slab C	3,00,001-5,00,000	20%
		Slab D	5,00,001-10,00,000	30%
		Accept CTC from user and display tax amount 
	
 * 
 * @author shuraut
 *
 */

public class IncomeTax {

	
	public static void main(String[] args) {

		int ctc;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter CTC");
		ctc=sc.nextInt();
		
		if(ctc<180000){
			System.out.println("Tax payable - NIL");
		}else if(ctc>=180001 && ctc<=300000){
			System.out.println("Tax payable -"+ctc*0.1);
		}else if(ctc>=300001 && ctc<=500000){
			System.out.println("Tax payable -"+ctc*0.2);
		}else if(ctc>=500001 && ctc<=1000000){
			System.out.println("Tax payable -"+ctc*0.2);
		}
		
	}

}
