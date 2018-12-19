package com.training;

public class CorporateTraining extends Training {

	private int days;
	public CorporateTraining(String subject, int fees, int days) {
		super(subject , fees);
		this.days=days;
	}
	@Override
	public int getOrderValue() {

		return days*getFees();
	}

	
}
