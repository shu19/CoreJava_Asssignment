package javaClassesAndObjects;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VehicleTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testHighestIdentificationNumber() {
		
		Vehicle vehicle1=new Vehicle("Shubham");
		Vehicle vehicle2=new Vehicle("Rohan");
		Vehicle vehicle3=new Vehicle("Tushar");
		Vehicle vehicle4=new Vehicle("Tejas");
		Vehicle vehicle5=new Vehicle("Deepika");
		Vehicle vehicle6=new Vehicle("Ankita");
		Vehicle vehicle7=new Vehicle();
		int actual=vehicle6.getHighestIdentificationNumber();
		assertEquals(7, actual);
		
	}

}
