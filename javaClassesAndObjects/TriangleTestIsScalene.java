package javaClassesAndObjects;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TriangleTestIsScalene {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Triangle t=new Triangle(5, 4, 3);
		assertEquals(true, t.isScalene());
	}

}
