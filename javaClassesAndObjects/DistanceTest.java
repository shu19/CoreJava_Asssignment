package javaClassesAndObjects;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Write the definition for a class called Distance that has properties feet as integer  and inches as float. 
 * The class has the following behaviours/services/methods :
	void set(int, float) to give value to object
	void disp() to display distance in feet and inches
	Distance add(Distance) to sum two distances & return distance
	1. Write the definitions for each of the above member functions.
	2. Write DistanceTest class with main function to create three Distance objects. 
	Set the value in two objects and call add() to calculate sum and assign it in third object. Display all distances.

 * 
 * @author shuraut
 *
 */
public class DistanceTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Distance d1=new Distance(1,1.2f);
		Distance d2=new Distance(2,2.2f);
		Distance d3=new Distance();
		
		String actual=d3.add(d1, d2).feet+" feet " + d3.add(d1, d2).inches+" inches";
		assertEquals("3 feet 3.4 inches", actual);
		
		
	}

}
