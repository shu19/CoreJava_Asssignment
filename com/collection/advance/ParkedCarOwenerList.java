package com.collection.advance;

import java.util.ArrayList;

/**
 * b. Create class Parked_CarOwenerList which will have method’s int
 * add_new_car(Parked_CarOwner_Details obj), remove_car(),
 * get_parked_car_location(token)
 * 
 * 
 * @author shuraut
 *
 */

public class ParkedCarOwenerList {

	
	int floor=3;
	int section=4;
	int noOfCarInEachSection=20;
	
	ArrayList<ParkedCarOwnerDetails> parkedCarOwnerDetailsArrayList;
	
	public ParkedCarOwenerList() {
		parkedCarOwnerDetailsArrayList=new ArrayList<ParkedCarOwnerDetails>();
	}
	
	public int addNewCar(ParkedCarOwnerDetails obj){
		
		parkedCarOwnerDetailsArrayList.add(obj);
		
		return 0;
	}
	
	public void removeCar(int token){
		
		
		
	}
	
	public int getParkedCarLocation(int token){
		
		return token;
		
	}
}
