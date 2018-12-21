package com.cg.io.test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.cg.io.WordCount;

public class WordCountTest {

	@Test
	public void test() {
		WordCount wordCount = new WordCount();
		String path = "src\\com\\cg\\io\\cg.txt";
		int actualWordCount = 0;
		try {
			actualWordCount = wordCount.countWordsInFile(path);
		} catch (IOException e) {
			e.printStackTrace();
		}

		assertEquals(288, actualWordCount);

	}
}
