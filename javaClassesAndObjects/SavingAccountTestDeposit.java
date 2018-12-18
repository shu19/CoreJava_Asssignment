package javaClassesAndObjects;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SavingAccountTestDeposit {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDepositGreaterThanZero() {
		SavingAccount shubham=new SavingAccount("Shubham Raut", 60000);
		shubham.deposit(2000);
		assertEquals(62000,shubham.getBalance(),2);
	}

	@Test
	public void testDepositLessThanZero() {
		SavingAccount shubham=new SavingAccount("Shubham Raut", 60000);
		shubham.deposit(-2000);
		assertEquals(60000,shubham.getBalance(),2);
	}

}
