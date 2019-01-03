package javaClassesAndObjects;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VehicleTestChangeSpeed {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPositiveSpeed() {
		
		final Vehicle baleno=new Vehicle("Shubham");
		baleno.changeSpeed(50);
		assertEquals(50, baleno.getCurrentSpeed());
			
	}


	@Test
	public void testNegativeSpeed() {
		
		final Vehicle baleno=new Vehicle("Shubham");
		baleno.changeSpeed(-50);
		assertEquals(0, baleno.getCurrentSpeed());
			
	}
}
