package javaClassesAndObjects;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * Write the definition for a class called Complex that has 
 * floating point properties for storing real and imaginary parts. 
 * The class has the following behaviours/services/methods:
	void set(float, float) to set the specified value in object
	void disp() to display complex number object
	complex sum() to sum two complex numbers & return complex number
	1. Write the definitions for each of the above member functions.
	2. Write a ComplexTest class with main function to create three complex number objects. 
	Set the value in two objects and call sum() to calculate sum and assign it in third object. 
	Display all complex numbers.
 * 
 */

public class ComplexTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		
		Complex complex1=new Complex(2,5);
		complex1.display();
		Complex complex2=new Complex(3,4);
		complex2.display();
		Complex complex3=new Complex();

		complex3=complex3.sum(complex1,complex2);
		assertEquals("complex number : 5.0 + 9.0 i", complex3.show());
		
		
	}

}
