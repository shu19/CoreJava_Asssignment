package basicpart2;

import java.util.Scanner;

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

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		String originalString=sc.nextLine();
		
//		CheckDuplicates c=new CheckDuplicates(originalString.charAt(0), 1);
		
		String sss;
		for(int i=0;i<originalString.length();i++){
		}

		System.out.println(removeDuplicates(originalString));
	}
	
	public static String removeDuplicates(String input){
	    String result = "";
	    for (int i = 0; i < input.length(); i++) {
	        if(!result.contains(String.valueOf(input.charAt(i)))) {
	            result += String.valueOf(input.charAt(i));
	        }
	    }
	    return result;
	}

}
class CheckDuplicates{
	private char character;
	private int count;
	
	
	public CheckDuplicates(char character, int count) {
		
		this.character = character;
		this.count = count;
	}
	public char getCharacter() {
		return character;
	}
	public void setCharacter(char character) {
		this.character = character;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}	
}

