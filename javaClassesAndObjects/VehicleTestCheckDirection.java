package javaClassesAndObjects;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VehicleTestCheckDirection {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTurnRight() {
		Vehicle v=new Vehicle();
		v.turn(50, Vehicle.TURN_RIGHT);
		assertEquals(Vehicle.EAST_DIRECTION, v.getDirection());
		
	}


	@Test
	public void testTurnLeft() {
		Vehicle v=new Vehicle();
		v.turn(50, Vehicle.TURN_LEFT);
		assertEquals(Vehicle.WEST_DIRECTION, v.getDirection());
		
	}
	

	@Test
	public void testTurnRightLeft() {
		Vehicle v=new Vehicle();
		v.turn(50, Vehicle.TURN_RIGHT);
		v.turn(50, Vehicle.TURN_LEFT);
		assertEquals(Vehicle.WEST_DIRECTION, v.getDirection());
		
	}
	

	@Test
	public void testTurnLeftRight() {
		Vehicle v=new Vehicle();
		v.turn(50, Vehicle.TURN_LEFT);
		v.turn(50, Vehicle.TURN_RIGHT);
		assertEquals(Vehicle.EAST_DIRECTION, v.getDirection());
		
	}
	
}
