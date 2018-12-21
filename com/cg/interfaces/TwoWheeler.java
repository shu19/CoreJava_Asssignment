package com.cg.interfaces;

public class TwoWheeler implements Vehicle {

	public TwoWheeler() {
	}
	
	@Override
	public void start() {
		System.out.println("Two Wheeler");
	}
	
	@Override
	public String toString() {	
		return "TwoWheeler";
	}

}
