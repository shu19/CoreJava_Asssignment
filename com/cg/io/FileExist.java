package com.cg.io;

import java.io.File;
import java.util.Scanner;

/**
 * 1) A Java FileExist Application accept the complete path of a file from the
 * user and display whether the file exist or not.
 * 
 * @author shuraut
 *
 */
public class FileExist {

	public boolean isFileExists(String path) {
		File file = new File(path);		
		return file.exists();
	}

}
