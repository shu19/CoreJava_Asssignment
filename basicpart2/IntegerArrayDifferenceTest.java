package basicpart2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Given an array of integers and an integer k, 
 * find out whether there are two distinct indices i and j in the 
 * array such that nums[i] = nums[j] 
 * and the absolute difference between i and j is at most k.
 * 
 * @author shuraut
 *
 */
public class IntegerArrayDifferenceTest {

	/**
	 * @throws java.lang.Exception
	 */
	IntegerArrayDifference integerArrayDifference;
	
	@Before
	public void setUp() throws Exception {
		integerArrayDifference=new IntegerArrayDifference();
	}

	@Test
	public void test() {
		int[] numbers={5,9,6,8,7,1,6,3};
		int k=3;
		
		int actualOutput=integerArrayDifference.findAbsoluteDifference(numbers,k);
		assertEquals(4, actualOutput);
	}

}
