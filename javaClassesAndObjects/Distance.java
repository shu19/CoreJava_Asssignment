package javaClassesAndObjects;
/**
 * 
 * Write the definition for a class called Distance that has properties feet as integer  and inches as float. 
 * The class has the following behaviours/services/methods:
	void set(int, float) to give value to object
	void disp() to display distance in feet and inches
	Distance add(Distance) to sum two distances & return distance
	1. Write the definitions for each of the above member functions.
	2. Write DistanceTest class with main function to create three Distance objects. Set the value in two objects and call add() to calculate sum and assign it in third object. Display all distances.

 * 
 * @author shuraut
 *
 */


public class Distance{

	int feet;
	float inches;

	public Distance(int feet, float inches) {
		// TODO Auto-generated constructor stub
		this.feet=feet;
		this.inches=inches;
		
	}
	
	public Distance() {
		// TODO Auto-generated constructor stub
	}

	public void set(int feet,float inches){
		this.feet=feet;
		this.inches=inches;
	}
	public void display(){
		System.out.println("Distance is : "+feet+" feet " +inches+" inches");
	}
	public Distance add(Distance d1,Distance d2) {
		Distance d=new Distance();
		d.feet=d1.feet+d2.feet;
		d.inches=d1.inches+d2.inches;
		return d;
	}

}
