package javaClassesAndObjects;

/**
 * 
 * Write the definition for a class called Complex that has 
 * floating point properties for storing real and imaginary parts. 
 * The class has the following behaviours/services/methods:
	void set(float, float) to set the specified value in object
	void disp() to display complex number object
	complex sum() to sum two complex numbers & return complex number
	1. Write the definitions for each of the above member functions.
	2. Write a ComplexTest class with main function to create three complex number objects. Set the value in two objects and call sum() to calculate sum and assign it in third object. Display all complex numbers.
 * 
 * @author shuraut
 *
 */

public class Complex {

	private float real;
	private float imaginary;
	
	public Complex() {
		
	}
	
	public Complex(float real, float imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public void set(float real,float imaginary){
		this.real=real;
		this.imaginary=imaginary;
	}
	
	public void display(){
		System.out.println("complex number : "+real+" + "+imaginary+" i");
	}
	public String show(){
		return "complex number : "+real+" + "+imaginary+" i";
	}
	public Complex sum(Complex number1,Complex number2){
		
		Complex complex=new Complex();
		complex.real=number1.real+number2.real;
		complex.imaginary=number1.imaginary+number2.imaginary;
		return complex;
		
	}
	
	public float getReal() {
		return real;
	}
	public void setReal(float real) {
		this.real = real;
	}
	public float getImaginary() {
		return imaginary;
	}
	public void setImaginary(float imaginary) {
		this.imaginary = imaginary;
	}		
}
