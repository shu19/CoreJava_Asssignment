package com.cg.io.test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.HashMap;

import org.junit.Test;

import com.cg.io.GrepApplication;

/**
 * 4) A Java grep Application: There is a useful utility in Unix called grep.
 * You can use grep to list the lines in a text file that contain a certain
 * strings. Here, 
 * 
 * In this assignment, You will write the Java version of grep
 * The user will input from the command line the search string and file name The
 * output of your program will be the line numbers AND the lines in which the
 * string occurs. If it does not find the string then a message is displayed to
 * show that the string was not found.
 * 
 * 
 * @author shuraut
 *
 */
public class GrepApplicationTest {

	@Test
	public void test() {
		GrepApplication grepApplication=new GrepApplication();
		String searchString="HINT";
		String path="src\\com\\cg\\io\\cg.txt";
		
		HashMap<Integer,String> actualLineNumber = null;
		try {
			actualLineNumber=grepApplication.getLineNumber(searchString,path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String expected="{20=HINT:- Use Serialization and Deserialization, 28=HINT:- Use Serialization and Desrialization with Collection}";
		String actual=actualLineNumber.toString();
		System.out.println(actualLineNumber);
		assertEquals(expected, actual);
		
	}
}
