package com.collection.advance.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Test;

import com.collection.advance.EmployeeAccountRelation;
import com.collection.advance.EmployeeInformation;
import com.collection.advance.MMSavingAccount;
/**
 * 
 * c. Employee_information object and MMASaving_Account object belongs to a same
 * entity assuming there are more than 5 entities how will you store the objects
 * preserving the relation between them.
 * @author shuraut
 *
 */
public class EmployeeInformationTest {

	@Test
	public void test() {
		EmployeeInformation empShubham=new EmployeeInformation(100, "Shubham", "Analyst", 15000, 10);
		MMSavingAccount savingShubham=new MMSavingAccount(1001, "Shubham", 20000, true);
		
		EmployeeInformation empRohan=new EmployeeInformation(101, "Rohan", "Analyst", 15000, 10);
		MMSavingAccount savingRohan=new MMSavingAccount(1002, "Rohan", 20000, true);
		
		EmployeeInformation empTushar=new EmployeeInformation(102, "Tushar", "Analyst", 15000, 10);
		MMSavingAccount savingTushar=new MMSavingAccount(1003, "Tushar", 20000, true);
		
		EmployeeInformation empTejas=new EmployeeInformation(103, "Tejas", "Analyst", 15000, 10);
		MMSavingAccount savingTejas=new MMSavingAccount(1004, "Tejas", 20000, true);
		
		EmployeeInformation empUjawala=new EmployeeInformation(104, "Ujawala", "Analyst", 15000, 10);
		MMSavingAccount savingUjawala=new MMSavingAccount(1005, "Ujawala", 20000, true);
		
		HashMap<String, EmployeeAccountRelation> hashMap=new HashMap<String, EmployeeAccountRelation>();
		hashMap.put("Shubham",new EmployeeAccountRelation(empShubham, savingShubham) );
		hashMap.put("Rohan",new EmployeeAccountRelation(empRohan, savingRohan) );
		hashMap.put("Tushar",new EmployeeAccountRelation(empTushar, savingTushar) );
		hashMap.put("Tejas",new EmployeeAccountRelation(empTejas, savingTejas) );
		hashMap.put("Ujawala",new EmployeeAccountRelation(empUjawala, savingUjawala) );

		Iterator itr=hashMap.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry<String, EmployeeAccountRelation> mEntry=(Map.Entry<String, EmployeeAccountRelation>)itr.next();
			
			
			System.out.println(mEntry.getKey() + "\t"+ mEntry.getValue());
		}


		
		
	}

}
