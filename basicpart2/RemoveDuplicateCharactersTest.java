package basicpart2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RemoveDuplicateCharactersTest {

	RemoveDuplicateCharacters removeDuplicateCharacters;
	@Before
	public void setUp() throws Exception {
		removeDuplicateCharacters=new RemoveDuplicateCharacters();
	}

	@Test
	public void test1() {
		String input="abcabcabc";
		
		String actual=removeDuplicateCharacters.removeDuplicates(input);
		String expected="abc";
		
		assertEquals(expected, actual);
		
	}


	@Test
	public void test2() {
		String input="javaforschool";
		
		String actual=removeDuplicateCharacters.removeDuplicates(input);
		String expected="javforschl";
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void test3() {
		String input="Mississippi";
		
		String actual=removeDuplicateCharacters.removeDuplicates(input);
		String expected="Misp";
		
		assertEquals(expected, actual);
		
	}

}
