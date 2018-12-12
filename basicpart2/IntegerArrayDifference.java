package basicpart2;

/**
 * Given an array of integers and an integer k, 
 * find out whether there are two distinct indices i and j in the 
 * array such that nums[i] = nums[j] 
 * and the absolute difference between i and j is at most k.
 * 
 * @author shuraut
 *
 */
public class IntegerArrayDifference {

	public int findAbsoluteDifference(int[] numbers, int k) {

		for(int i=0;i<numbers.length;i++){
			
			for(int j=i;j<numbers.length;j++){
				
				if(i!=j){
					if(numbers[i]==numbers[j]){
						int diff=Math.abs(i-j);
						
						return diff;
					}


				}
				
			}
		}
		return -1;
	}

}
