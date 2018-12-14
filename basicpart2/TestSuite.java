package basicpart2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	CheckArrayForPalindromeTest.class,
	IntegerArrayDifferenceTest.class,
	ReverseStringTest.class
})
public class TestSuite {

	@Before
	public void setUp() throws Exception {
		
		
	}

	@Test
	public void test() {
		
	}

}
