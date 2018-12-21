package com.cg.io.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

import com.cg.io.Employee;

/**
 * 5) Create an employee class with id, name and salary. Create a class with
 * main() write a code to persist the object in the file. Create another class
 * with main() write code to read the object from the file. run the first
 * main(), this should write the object in file succesfullky. now run the second
 * main(), this should read the object from the file and display it on the
 * console screen. HINT:- Use Serialization and Deserialization
 * 
 * @author shuraut
 *
 */

public class EmployeeTest {

	@Test
	public void testWriteFile() {
		Employee employee=new Employee(101,"Shubham",15000);

		String path="src\\com\\cg\\io\\employee.txt"; 
		File file=new File(path);
		if(!file.exists()){
			try {
				file.createNewFile();
				FileOutputStream fos = new FileOutputStream(path);
				ObjectOutputStream oos = new ObjectOutputStream(fos);   
				oos.writeObject(employee); 
				oos.close(); 

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			FileOutputStream fos;
			try {
				fos = new FileOutputStream(path);
				ObjectOutputStream oos = new ObjectOutputStream(fos);   
				oos.writeObject(employee); 
				oos.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Test
	public void testReadFile() {
		Employee employee=new Employee(101,"Shubham",15000);

		String path="src\\com\\cg\\io\\employee.txt"; 
		File file=new File(path);
		if(file.exists()){
			try {
				FileReader fr=new FileReader(file);
				FileInputStream is = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(is);
				Employee emp = (Employee) ois.readObject();
				ois.close();
				is.close();
				System.out.println(emp.toString());
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}else{
			
		}
	}







}
