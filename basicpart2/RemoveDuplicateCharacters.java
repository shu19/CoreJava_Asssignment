package basicpart2;



/**
 * Write a program to input a word from the user and remove the duplicate characters present in it.
	Example:
	INPUT – abcabcabc
	OUTPUT – abc
	INPUT – javaforschool
	OUTPUT – javforschl
	INPUT – Mississippi
	OUTPUT – Misp

 * @author shuraut
 *
 */
public class RemoveDuplicateCharacters {


	/**
	 * @param input  : this is input String which contains duplicate characters
	 * 
	 * @return uniqueCharactersString : this is String without duplicate characters in it.
	 */
	public String removeDuplicates(String input){
		String uniqueCharactersString = new String();  //String is initialized
	    for (int index = 0; index< input.length(); index++) {
	        if(!uniqueCharactersString.contains(String.valueOf(input.charAt(index)))) { // checks for character in string
	        	uniqueCharactersString+= String.valueOf(input.charAt(index));  // if character is not present in string then only it appends the string
	        }
	    }
	    return uniqueCharactersString;
	}

}