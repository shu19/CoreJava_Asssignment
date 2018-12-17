package javaClassesAndObjects;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TriangleTestIsIsosceles {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIfTriangleIsIsosceles() {
		Triangle t=new Triangle(5, 5, 1);
		assertEquals(true,t.isIsosceles());
		
	}

	
	@Test
	public void testIfTriangleIsNotIsosceles() {
		Triangle t=new Triangle(1, 1, 1);
		assertEquals(true,t.isIsosceles());
		
	}
	
	@Test
	public void testIfTriangleIsNotIsoscelesT() {
		Triangle t=new Triangle(1, 1, 1);
		assertEquals(false,t.isIsosceles());
		
	}
}
