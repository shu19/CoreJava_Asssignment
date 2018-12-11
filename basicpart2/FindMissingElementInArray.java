package basicpart2;

/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find
 * the one that is missing from the array.
 * 
 * Example 1:
 * 
 * Input: [3,0,1] Output: 2 Example 2:
 * 
 * Input: [9,6,4,2,3,5,7,0,1] Output: 8
 * 
 * @author shuraut
 *
 */
public class FindMissingElementInArray {

	
	/**
	 * This method takes integer array 
	 * and returns the missing integer element in the array
	 * 
	 * First array is sorted and then it finds missing element using for loop.  
	 * 
	 * @param numbers is a integer array
	 * @return
	 */
	public int getMissingElement(int[] numbers) {
		
		/**
		 * here two nested for loop sorts numbers array using bubble sort algorithm
		 */
		for (int i = 0; i < numbers.length; i++) { 
			for (int j = 0; j < numbers.length - 1; j++) {
				if (numbers[j] > numbers[j + 1]) {  //if first number is greater second then swapping is done using temp variable
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}

		
		/**
		 * this for loop checks the missing element 
		 */
			for(int i=0;i<numbers.length;i++){
				if(numbers[i]!=i){
					return i;
				}
			}
		
		return numbers.length;
	}

}
