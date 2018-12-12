package basicpart2;


/**
 * Write a program to find if a particular element is present in a multi-dimensional array.
 * 
 * @author shuraut
 *
 */

public class MultidimensionalArray {


	public boolean searchElement(int numberToBeSearch, int[][] numbers) {

		for(int row=0;row<numbers.length;row++){
			
			for(int column=0;column<numbers[0].length;column++){
				
				if(numberToBeSearch==numbers[row][column]){
					return true;
				}
			}
			
		}
		return false;
	}

}
