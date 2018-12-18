package javaClassesAndObjects;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SavingAccountTestFundTransfer {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFundTransferAmountLessThanBalance() {
		SavingAccount shubham=new SavingAccount("Shubham", 5000);		
		
		SavingAccount Rohan=new SavingAccount("Shubham", 6000);
		
		PaymentGateway.transfer(shubham, Rohan, 2000);
		
		assertEquals(3000, shubham.getBalance(),2);
	}

	@Test
	public void testFundTransferAmountDebitedFromSender() {
		SavingAccount shubham=new SavingAccount("Shubham", 5000);		
		
		SavingAccount Rohan=new SavingAccount("Shubham", 6000);
		
		PaymentGateway.transfer(shubham, Rohan, 2000);
		
		assertEquals(3000, shubham.getBalance(),2);
	}

	@Test
	public void testFundTransferAmountCreditedToReceiver() {
		SavingAccount shubham=new SavingAccount("Shubham", 5000);		
		
		SavingAccount rohan=new SavingAccount("Shubham", 6000);
		
		PaymentGateway.transfer(shubham, rohan, 2000);
		
		assertEquals(3000, rohan.getBalance(),2);
	}
	
	
	@Test
	public void testFundTransferAmountGreaterThanBalance() {
		SavingAccount shubham=new SavingAccount("Shubham", 5000);		
		
		SavingAccount Rohan=new SavingAccount("Shubham", 6000);
		
		PaymentGateway.transfer(shubham, Rohan, 9000);
		
		assertEquals(5000, shubham.getBalance(),2);
		
	}
}


