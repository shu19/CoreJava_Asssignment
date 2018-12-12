package basicpart2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NamesArrayTest {
	NamesArray namesArray;
	@Before
	public void setUp() throws Exception {
		namesArray=new NamesArray();
	}

	@Test
	public void testNamePresentInArray() {
		String names[]={"Dave", "Ann", "George", "Sam", "Ted", "Gag", "Saj", "Agati", "Mary", "Sam", "Ayan", "Dev", "Kity", "Meery", "Smith", "Johnson", "Bill", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson", "George", "Sam", "Ted"};
		
		int actual =namesArray.countOccurrence(names,"George");
		int expected=2;
		
		assertEquals(expected, actual);
		}

	@Test
	public void testNameNotPresentInArray() {
		String names[]={"Dave", "Ann", "George", "Sam", "Ted", "Gag", "Saj", "Agati", "Mary", "Sam", "Ayan", "Dev", "Kity", "Meery", "Smith", "Johnson", "Bill", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson", "George", "Sam", "Ted"};
		
		int actual =namesArray.countOccurrence(names,"Shubham");
		int expected=0;
		
		assertEquals(expected, actual);
		}

	
}
