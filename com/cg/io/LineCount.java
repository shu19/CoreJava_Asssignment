package com.cg.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 2) A Java LineCount Application: accept the complete path of a file from user
 * and count the number of lines in that file and print it on the console.
 * 
 * 
 * @author shuraut
 *
 */
public class LineCount {

	public boolean isFileExist(String path) {
		File file=new File(path);
		return file.exists();
	}

	public int countLineOfFile(String path) {
		File file=new File(path);
	
		try {
			BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
			int lineCount=0;
			while(bufferedReader.readLine() != null){
				lineCount++;
			}
			bufferedReader.close();
			return lineCount;
			
		} catch (FileNotFoundException e) {
			System.out.println("File not exists");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
}
