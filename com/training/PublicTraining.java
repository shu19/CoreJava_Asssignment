package com.training;

public class PublicTraining extends Training{

	private int participent;
	
	public PublicTraining(String subject, int fees, int participent) {
		super(subject,fees);
		this.participent=participent;
	}

	@Override
	public int getOrderValue() {

			return participent*getFees();
		
	}

	

}
