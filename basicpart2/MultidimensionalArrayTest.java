package basicpart2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MultidimensionalArrayTest {

	MultidimensionalArray multidimensionalArray;
	
	@Before
	public void setUp() throws Exception {
		multidimensionalArray=new MultidimensionalArray();
	}

	@Test
	public void testIfNumberIsFound() {
		int numbers[][]={
				{5,8,3},
				{1,9,6}
		};
		
		boolean actual=multidimensionalArray.searchElement(9,numbers);
		
		assertEquals(true, actual);

		
	}

	@Test
	public void testIfNumberIsNotFound() {
		int numbers[][]={
				{5,8,3},
				{1,2,6},
				{7,4,2},
		};
		
		boolean actual=multidimensionalArray.searchElement(9,numbers);
		
		assertEquals(false, actual);

		
	}
	
}
