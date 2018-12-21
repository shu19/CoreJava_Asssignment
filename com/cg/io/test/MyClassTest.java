package com.cg.io.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import org.junit.Test;

import com.cg.io.Employee;
import com.cg.io.MyClass;

/**
 * 6) create a class "MyClass". create 5 different objects of it. add them in an
 * arraylist. store arraylist in file. Now open a file, read arraylist and
 * display all objects. HINT:- Use Serialization and Desrialization with
 * Collection
 * 
 * @author shuraut
 *
 */
public class MyClassTest {

	@Test
	public void test() {
		MyClass myClass1 =new MyClass();

		MyClass myClass2 =new MyClass();
		MyClass myClass3 =new MyClass();
		MyClass myClass4 =new MyClass();
		MyClass myClass5 =new MyClass();

		MyClass object[]={myClass1,myClass2,myClass3,myClass4,myClass5};
		
		for(MyClass myClass:object){
			
			
		}
	
		String s;
		for(int i=0;i<object.length;i++){
			s=object[i].str;
			System.out.println(s);
		}
		ArrayList<MyClass> arrayList=new ArrayList<>();
		arrayList.add(myClass1);
		arrayList.add(myClass2);
		arrayList.add(myClass3);
		arrayList.add(myClass4);
		arrayList.add(myClass5);

		String path="src\\com\\cg\\io\\myClassArray.txt"; 
		File file=new File(path);
		if(!file.exists()){
			try {
				file.createNewFile();
				FileOutputStream fos = new FileOutputStream(path);
				ObjectOutputStream oos = new ObjectOutputStream(fos);   
				oos.writeObject(arrayList); 
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
				oos.writeObject(arrayList); 
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
		String path="src\\com\\cg\\io\\myClassArray.txt"; 
		File file=new File(path);
		if(file.exists()){
			try {
				FileReader fr=new FileReader(file);
				FileInputStream is = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(is);
				ArrayList<MyClass> emp = (ArrayList<MyClass>) ois.readObject();
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
			System.out.println("File Not Exists");
		}

	}
	
}
