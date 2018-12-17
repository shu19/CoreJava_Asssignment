package javaClassesAndObjects;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TriangleTestIsRight {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIfTriangleIsRight() {
		Triangle rightAngledTriangle=new Triangle(3,4,5);
		assertEquals(true, rightAngledTriangle.isRight());
	}

	@Test
	public void testIfTriangleIsNotRight() {
		Triangle notRightAngledTriangle=new Triangle(3,5,5);
		assertEquals(false, notRightAngledTriangle.isRight());
	}


	@Test
	public void testIfTriangleIsNotRightAndAllSidesAreEqual() {
		Triangle notRightAngledTriangle=new Triangle(5,5,5);
		assertEquals(false, notRightAngledTriangle.isRight());
	}
}
