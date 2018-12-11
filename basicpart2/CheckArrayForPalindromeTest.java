package basicpart2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CheckArrayForPalindromeTest {
	CheckArrayForPalindrome checkArrayForPalindrome;
	@Before
	public void setUp(){
		checkArrayForPalindrome=new CheckArrayForPalindrome();
	}
	
	@Test
	public void test() {
		String[] input={
				"ABCD",
				"PPPOOOOPPP",
				"PQRS",
				"AABB",
				"ABBA",
				"ABA",
				"ACCCA",
				"ANMMNA",
				"MAAM",
				"HIJKJIH"
		};
		String []actual=checkArrayForPalindrome.checkPalindromAndSortArrayInDescendingOrder(input);
		String expected[]={"PPPOOOOPPP", "MAAM", "HIJKJIH", "ANMMNA", "ACCCA", "ABBA", "ABA"};
		assertEquals(expected, actual);
		
	}

}
