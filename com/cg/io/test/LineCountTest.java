package com.cg.io.test;

import org.junit.Assert;
import org.junit.Test;

import com.cg.io.LineCount;

public class LineCountTest {

	@Test
	public void testFileExist() {
		LineCount lineCount=new LineCount();
		String path="src\\com\\cg\\io\\cg.txt";
		boolean actual=lineCount.isFileExist(path);
		Assert.assertEquals(true, actual);
	}
	
	@Test
	public void testFileNotExist() {
		LineCount lineCount=new LineCount();
		String path="src\\com\\cg\\io\\cg.txt";
		boolean actual=lineCount.isFileExist(path);
		Assert.assertEquals(true, actual);
	}
	

	@Test
	public void testCountLine() {
		LineCount lineCount=new LineCount();
		String path="src\\com\\cg\\io\\cg.txt";
		int actual=lineCount.countLineOfFile(path);
		Assert.assertEquals(28, actual);

	}
	

}
