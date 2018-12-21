package com.cg.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * 3) A Java WordCount Application: accept the path of a file from user and
 * count the number of words in that file and print it on the console.
 * 
 * @author shuraut
 *
 */
public class WordCount {

	public int countWordsInFile(String path) throws IOException {
		File file=new File(path);
		FileReader fr=new FileReader(file);
		Scanner sc =new Scanner(fr);
		int count=0;
		while(sc.hasNext()){
			if(sc.next() != null){
				count++;
			}		
		}
		return count;
	}

}
