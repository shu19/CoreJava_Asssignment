package com.cg.interfaces;

public class ThreeWheeler implements Vehicle {

	public ThreeWheeler() {
	}

	@Override
	public void start() {
		System.out.println("Three Wheeler");
	}

	@Override
	public String toString() {
		return "ThreeWheeler";
	}
}
