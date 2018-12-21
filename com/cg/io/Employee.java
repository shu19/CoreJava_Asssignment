package com.cg.io;

import java.io.Serializable;

/**
 * 
 * 5) Create an employee class with id, name and salary. Create a class with
 * main() write a code to persist the object in the file. Create another class
 * with main() write code to read the object from the file. run the first
 * main(), this should write the object in file succesfullky. now run the second
 * main(), this should read the object from the file and display it on the
 * console screen. HINT:- Use Serialization and Deserialization
 * 
 * 
 * @author shuraut
 *
 */

public class Employee implements Serializable{

	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;	
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ "]";
	}

	
}
