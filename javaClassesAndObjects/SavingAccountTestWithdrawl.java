package javaClassesAndObjects;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SavingAccountTestWithdrawl {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testWithdrawlAmountLessThanBalance() {
		SavingAccount shubham=new SavingAccount("Shubham Raut", 5000);
		shubham.withdraw(2000);
		
		assertEquals(3000, shubham.getBalance(),2);
			

	}

	@Test
	public void testWithdrawlAmountGreaterThanBalance() {
		SavingAccount shubham=new SavingAccount("Shubham Raut", 5000);
		shubham.withdraw(8000);
		
		assertEquals(5000, shubham.getBalance(),2);
			

	}


	
}
