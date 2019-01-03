package com.collection.advance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * b. Create class Parked_CarOwenerList which will have method’s int
 * add_new_car(Parked_CarOwner_Details obj), remove_car(),
 * get_parked_car_location(token)
 * 
 * @author shuraut
 *
 */

public class ParkedCarOwenerList {
	
	HashMap<Integer, ParkedCarOwnerDetails> hashMap;
	
	public ParkedCarOwenerList() {
		hashMap=new HashMap<Integer, ParkedCarOwnerDetails>();
	}
	
	public int addNewCar(ParkedCarOwnerDetails obj){
		hashMap.put(obj.getToken(), obj);
		return obj.getToken();
	}
	
	public void removeCar(int token){
		hashMap.remove(token);	
	}
	
	public String getParkedCarLocation(int token){
		String location="Your car is parked on Floor "+hashMap.get(token).getFloor()+" Section "
				+ hashMap.get(token).getSection()+" Slot "
						+ hashMap.get(token).getLocationInSection();
	
		return location;		
	}
}