package javaClassesAndObjects;

import static org.junit.Assert.*;

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
		System.out.println(d2.isSmaller(d1));

	}

}
