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

	public static void main(String[] args) {

		int arr[] = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
//		int arr[] = { 3,0,1};
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

			for(int i=0;i<arr.length;i++){
				if(arr[i]!=i){
					System.out.println(i);
				}
			}

	}

}
