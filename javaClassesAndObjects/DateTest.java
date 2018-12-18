package javaClassesAndObjects;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class DateTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Date d1=new Date(10,12,2017);
		Date d2=new Date(10,12,2016);
		assertEquals(true, d2.isSmaller(d1));

	}

	@Test
	public void testDiff(){
		Date d1=new Date(5,6,1980);
		Date d2=new Date(2,3,1987);
		
		Date d=new Date();
		int[] expected={27,8,6};
		assertArrayEquals(expected, d.diff(d1, d2));
		
	}
}
