package com.collection.advance;

public class EmployeeAccountRelation {

	private EmployeeInformation employeeInformation;
	private MMSavingAccount mmSavingAccount;
	
	/**
	 * @param employeeInformation
	 * @param mmSavingAccount
	 */
	public EmployeeAccountRelation(EmployeeInformation employeeInformation,
			MMSavingAccount mmSavingAccount) {
		super();
		this.employeeInformation = employeeInformation;
		this.mmSavingAccount = mmSavingAccount;
	}
	
	 

	@Override
	public String toString() {
		return "\nEmployeeAccountRelation [\nemployeeInformation="
				+ employeeInformation + ", \nmmSavingAccount=" + mmSavingAccount
				+ "\n]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((employeeInformation == null) ? 0 : employeeInformation
						.hashCode());
		result = prime * result
				+ ((mmSavingAccount == null) ? 0 : mmSavingAccount.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeAccountRelation other = (EmployeeAccountRelation) obj;
		if (employeeInformation == null) {
			if (other.employeeInformation != null)
				return false;
		} else if (!employeeInformation.equals(other.employeeInformation))
			return false;
		if (mmSavingAccount == null) {
			if (other.mmSavingAccount != null)
				return false;
		} else if (!mmSavingAccount.equals(other.mmSavingAccount))
			return false;
		return true;
	}



	public EmployeeInformation getEmployeeInformation() {
		return employeeInformation;
	}

	public MMSavingAccount getMmSavingAccount() {
		return mmSavingAccount;
	}
	
	
	
	
}
