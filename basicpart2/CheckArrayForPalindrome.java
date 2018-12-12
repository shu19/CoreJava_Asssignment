package basicpart2;

public class CheckArrayForPalindrome {

	public String[] checkPalindromAndSortArrayInDescendingOrder(String[] input) {

		/*
		 * palindromeNumberCount : this is count of palindrome word present in
		 * array, this count is used to initialize the String Array size
		 */
		int palindromeNumberCount = 0;
		for (String word : input) {
			if (isPalindrome(word)) {
				palindromeNumberCount++; // For every palindrome word count is
											// incrementing
			}
		}

		String[] words = new String[palindromeNumberCount];// String array is
															// Initialized with
															// size of
															// palindrome number
															// count

		int wordsCountInArray = 0;
		for (String word : input) {
			if (isPalindrome(word)) {
				words[wordsCountInArray] = word;
				wordsCountInArray++;
			}
		}

		// This for loop is used to sort the array in descending order

		for (int i = 0; i < words.length - 1; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].compareTo(words[j]) < 0) {
					String temp = words[i];
					words[i] = words[j];
					words[j] = temp;
				}
			}
		}

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