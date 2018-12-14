package javaClassesAndObjects;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RectangleTestCheckTwoAreaSameOrNot {


	@Test
	public void test() {

		Rectangle rectangle=new Rectangle();
		
		boolean actual=rectangle.isAreaOfTwoRectangleSame(new Rectangle(10,5), new Rectangle(5,10));

		assertEquals(true, actual);

	}

}
