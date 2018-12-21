package com.cg.interfaces;

public class FourWheeler implements Vehicle {

	public FourWheeler() {
	}

	@Override
	public void start() {
		System.out.println("Four Wheeler");
	}

	@Override
	public String toString() {
		return "FourWheeler";
	}
}
