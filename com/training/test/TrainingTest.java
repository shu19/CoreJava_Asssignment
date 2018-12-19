package com.training.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.training.CorporateTraining;
import com.training.PublicTraining;
import com.training.Training;

/**
 * 1) Create object of PublicTraining using upcasting with some initial value as
 * subject = Java, fees = 5000 and No. of Participants will be 50. 2) Get the
 * cost of the training 3) Create object of CorporateTraining using upcasting
 * with some initial valueas subject = Big Data, fees = 35000 and No. of days =
 * 4 4) Get the cost of the training
 * 
 * 
 * @author shuraut
 *
 */

public class TrainingTest {


	@Test
	public void testPublicTraining() {
		Training publicTraining = new PublicTraining("Java", 5000,50);
		int actual=publicTraining.getOrderValue();
		assertEquals(250000, actual);
		
	}
	


	@Test (expected = Exception.class)
	public void testForNegativeFees(){
		Training publicTraining = new PublicTraining("Java", -5000,50);
		int actual=publicTraining.getOrderValue();
		assertEquals(250000, actual);
		
	}
	
	@Test
	public void testForZeroFees(){
		
	}
	
	@Test
	public void testForNegativeParticipent(){
		
	}
	@Test
	public void testForZeroParticipent(){
		
	}
		
	
}
