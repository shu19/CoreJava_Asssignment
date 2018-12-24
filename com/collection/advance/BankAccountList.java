package com.collection.advance;

import java.util.TreeSet;

/**
 * * c. Create class BankAccountList
 * which will maintain SavingAccount objects. Ensure that this class should not
 * allow duplicates as well as data should be displayed in sorted order. (as per
 * acc_ID)
 * 
 * @author shuraut
 *
 */
public class BankAccountList {


	public TreeSet<SavingAccount> bankAccounts(){
		SavingAccount shubhamSavingAccount = new SavingAccount(10000,100,"Shubham", true);
		SavingAccount rohanSavingAccount = new SavingAccount(12000,101, "Rohan",true);
		SavingAccount tusharSavingAccount = new SavingAccount(15000,102, "Tushar",true);
		SavingAccount tejasSavingAccount = new SavingAccount(15000,103, "Tejas",true);
		SavingAccount deepikaSavingAccount = new SavingAccount(13000,104,"Deepika", true);

		TreeSet<SavingAccount> savingAccountsTreeSet=new TreeSet<SavingAccount>();
		savingAccountsTreeSet.add(shubhamSavingAccount);
		savingAccountsTreeSet.add(rohanSavingAccount);
		savingAccountsTreeSet.add(tusharSavingAccount);
		savingAccountsTreeSet.add(tejasSavingAccount);
		savingAccountsTreeSet.add(deepikaSavingAccount);
		
		
		return savingAccountsTreeSet;
	}
	
	
}
