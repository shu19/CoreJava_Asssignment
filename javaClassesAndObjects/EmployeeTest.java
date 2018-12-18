package javaClassesAndObjects;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAnnualBasic() {
		Employee e=new Employee();
		e.setMonthlyBasic(10000);
		assertEquals(120000, e.getAnnualBasic(),2);
		
	}

}
