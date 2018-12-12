package basicpart2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReverseStringTest {

	ReverseString reverseString;

	@Before
	public void setUp() throws Exception {
		reverseString = new ReverseString();
	}

	@Test
	public void test() {
		String input="Let's take LeetCode contest";
		
		String actual=reverseString.getReverseString(input);
		
		String expected="s'teL ekat edoCteeL tsetnoc ";
		assertEquals(expected, actual);
	}

}
