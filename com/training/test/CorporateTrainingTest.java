package com.training.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.training.CorporateTraining;
import com.training.PublicTraining;
import com.training.Training;

public class CorporateTrainingTest {

	@Test
	public void testCorporateTraining() {
		Training corporateTraining = new CorporateTraining("Big Data", 35000, 4);
		int actual = corporateTraining.getOrderValue();
		assertEquals(140000, actual);
	}

	@Test(expected = Exception.class)
	public void testForNegativeFees() {
		Training corporateTraining = new CorporateTraining("Big Data", -35000, 4);
		int actual = corporateTraining.getOrderValue();
		assertEquals(140000, actual);

	}

	@Test
	public void testForZeroFees() {

	}

	@Test
	public void testForNegativeDays() {

	}

	@Test
	public void testForZeroDays() {

	}

}