package com.cg.io.test;

import org.junit.Assert;
import org.junit.Test;

import com.cg.io.FileExist;

public class FileExistsTest {

	@Test
	public void testFileExist() {
		FileExist fileExist=new FileExist();
		String path="src\\com\\cg\\io\\cg.txt";
		boolean actual=fileExist.isFileExists(path);
		Assert.assertEquals(true, actual);
		
			
	}
	
	@Test
	public void testFileNotExist() {
		FileExist fileExist=new FileExist();
		String path="src\\com\\cg\\io\\file.txt";
		boolean actual=fileExist.isFileExists(path);
		Assert.assertEquals(false, actual);
		
			
	}

}
