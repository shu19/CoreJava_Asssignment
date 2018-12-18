package javaClassesAndObjects;

public class PaymentGateway {
	// method to transfer the given amount from the src to target account.
	public static boolean transfer(SavingAccount sender,SavingAccount reciever, double amount) {
		
		if (sender.getBalance() >= amount) {
			sender.withdraw(amount);
			reciever.deposit(amount);
			return true;
		} else {
			return false;
		}
		// If the sender account balance = the given amount then the amount is
		// transferred from the sender to the reciever account and true is
		// returned
		// otherwise false is returned.
	}
}
