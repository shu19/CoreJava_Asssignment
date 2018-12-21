package com.cg.interfaces;

/**
 * Define an interface “Vechicle” with “start()” function . Now derive classes
 * like “TwoWheeler”, “ThreeWheeler”,”FourWheeler” etc. from “Vehicle” and
 * override “start()” function. Define a class “VDemo” in which write main()
 * function. In the main function create an array of Vehicle class. In this
 * array store instances of the sub classes. Traverse through the array and call
 * “start()” function only if there is a class “ThreeWheeler”.
 * 
 * @author shuraut
 *
 */
public interface Vehicle {

	public void start();
}
