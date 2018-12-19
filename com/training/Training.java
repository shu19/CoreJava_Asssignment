package com.training;

/**  
 * @author shuraut
 *
 *	Training
		id
		subject
		fees
	
	PublicTraining		         	CorporateTraining
		participants	                      	days
		getOrderValue()	 	       		getOrderValue()	
		(fees * participants)		       (fees * days)
	
	Implementation Details:
		Training Charges are applied on the basis of training types. If it's a corporate company, charges are applied on the basis of per day(fees * days). But if it is a public program, charges are applied on the basis of, no. of participants (fees * participants).


	In main()	
		1) Create object of PublicTraining using upcasting with some initial value as subject = Java, fees = 5000 and No. of Participants will be 50.		
		2) Get the cost of the training 
		3) Create object of CorporateTraining using upcasting with some initial valueas subject = Big Data, fees = 35000 and No. of days = 4
		4) Get the cost of the training

 *
 */
public abstract class Training {

	private final int id;
	private String subject;
	private int fees;
	private static int highestId;

	static{
		highestId=100;
	}
	
	{
		id = highestId++;
	}

	
	public Training(String subject, int fees) {
		super();
		this.subject = subject;
		this.fees = fees;
	}
	
	public abstract int getOrderValue();

	public int getId() {
		return id;
	}

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	
	
	
}
