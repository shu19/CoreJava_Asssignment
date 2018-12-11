package basicpart2;

import java.util.Scanner;

/**
 * Write a program to accept a sentence from the user and perform the following task:
	a. Accept the sentence and reduce all the extra blank space between two words to a single blank space.
	b. Accept a word from the user which is part of the sentence along with its position number and delete the word and display the sentence.
	
	Test your program with the sample data and some random data:
	
	Example 1
	INPUT:  A    MORNING WALK IS A IS BLESSING FOR   THE  WHOLE DAY.
	WORD TO BE DELETED: IS
	WORD POSITION IN THE SENTENCE: 6
	OUTPUT: A MORNING WALK IS A BLESSING FOR THE WHOLE DAY.
	Example 2
	INPUT: AS YOU    SOW, SO   SO YOU REAP.
	WORD TO BE DELETED: SO
	WORD POSITION IN THE SENTENCE: 4
	OUTPUT:      AS YOU SOW, SO YOU REAP

 * @author shuraut
 *
 */
public class RemoveSpaces {


	public String identifyAndRemoveSpacesInString(String input, String wordToBeDeleted, int wordPositionInSentence) {

		StringBuffer sb=new StringBuffer();
		String[] splittedString=input.split("\\s+");
		
		for(int i=0;i<splittedString.length;i++){
			if(!((i+1)==wordPositionInSentence && wordToBeDeleted.equals(splittedString[i]))){
				sb.append(splittedString[i]+" ");
			}
		}

		
		return sb.toString();
	}

}
