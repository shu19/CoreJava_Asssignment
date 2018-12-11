package basicpart2;

import java.util.Arrays;
import java.util.Collections;

public class CheckArrayForPalindrome {

	public String[] checkPalindromAndSortArrayInDescendingOrder(String[] input) {
		String[] words = new String[7];
		int wordsCountInArray = 0;
		for (String word : input) {
			if (isPalindrome(word)) {
				words[wordsCountInArray] = word;
				wordsCountInArray++;
			}
		}

		Arrays.sort(words,Collections.reverseOrder());
		
		return words;
	}

	public boolean isPalindrome(String word) {
				
		StringBuffer sb = new StringBuffer();
		for (int i = word.length() - 1; i >= 0; i--) {
			sb.append(word.charAt(i));
		}
		
		return word.equals(sb.toString());
	}

}