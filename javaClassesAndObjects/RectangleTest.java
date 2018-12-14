package javaClassesAndObjects;
/**
 * Consider a Rectangle Shape.
 * Identify its properties and behaviours and implement the same.
 * Write a Test Cases to check if the behaviours(methods) are implemented properly.
 * If their are 2 Rectangle objects of different sizes than we should be able to 
 * check if they are having same area or not.
 * Test the Program with different combinations test cases possible.

 */
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RectangleTest {



	@Test
	public void testAreaOfRectangleForPositiveLengthBreadth() {

		Rectangle rectangle=new Rectangle(10, 5);
		double expected=50;
		double actual =rectangle.areaOfRectangle();
		
		assertEquals(expected, actual,2);
		
	}

	


}
