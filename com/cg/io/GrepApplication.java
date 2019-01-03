package com.cg.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GrepApplication {

	public HashMap<Integer,String> getLineNumber(String searchString, String path)
			throws IOException {
		
		HashMap<Integer,String> hashMap=new HashMap<>();
		
		File file = new File(path);
		if (file.exists()) {

			final BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			String line = bufferedReader.readLine();

			int count = 1;
			while (line != null) {
				if (line.contains(searchString)) {
					hashMap.put(count, line);
				}
				line = bufferedReader.readLine();
				count++;
			}
			bufferedReader.close();

		}else{
			throw new FileNotFoundException();
		}

		return hashMap;
	}

}
