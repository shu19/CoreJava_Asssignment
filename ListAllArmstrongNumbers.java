/**
 * 3)	Find out all the Armstrong numbers falling in the range of 100-999
 * @author shuraut
 *
 */
public class ListAllArmstrongNumbers {

	public static void main(String[] args) {

		for(int i=100;i<=999;i++){
			if(isArmstrongNumber(i)){
				System.out.println(i);
			}
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
		temp=i; //original number is saved in temporary variable. 
		int sum=0; // 
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
