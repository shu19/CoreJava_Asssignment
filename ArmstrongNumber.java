
/**
 * 2)	Find out if the given number is an Armstrong number.
	Logic: - if 153 is the Supplied value, then  13 + 53 + 33 = 1+125+27 = 153 

	This is the same as supplied value hence it is an Armstrong number.


 * 
 * @author shuraut
 *
 */
public class ArmstrongNumber {

	public static void main(String[] args) {
		if(isArmstrongNumber(153)){
			System.out.println("This is Armstrong Number");
		}else{
			System.out.println("This is not Armstrong Number");
		}
	}

	/**
	 * This method checks Armstrong Number. 
	 * If number is Armstrong Number then it returns true
	 * If number is not Armstrong Number then it returns false
	 * 
	 * @param i is number
	 * @return
	 */
	private static boolean isArmstrongNumber(int i) {
		
		int temp;
		int a;
		temp=i;
		int sum=0;
		while(i>0){
			a=i%10;
			i=i/10;
			sum=sum+(a*a*a);
			
		}
		if(temp==sum){
			return true;
		}
			return false;
	}
	

}
