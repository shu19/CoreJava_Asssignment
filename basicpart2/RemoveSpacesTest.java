package basicpart2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RemoveSpacesTest {

	RemoveSpaces removeSpaces;
	
	@Before
	public void setUp(){
		removeSpaces=new RemoveSpaces();
	}
	
	
	@Test
	public void test() {

		String input="A    MORNING WALK IS A IS BLESSING FOR   THE  WHOLE DAY";
		String wordToBeDeleted="IS";
		int wordPositionInSentence=6;
		String actualString=removeSpaces.identifyAndRemoveSpacesInString(input,wordToBeDeleted,wordPositionInSentence);
		System.out.println(actualString);
		String expectedString="A MORNING WALK IS A BLESSING FOR THE WHOLE DAY ";
		
		
		assertEquals(expectedString,  actualString);
	}
	
	@Test
	public void test2() {

		String input="AS YOU    SOW, SO   SO YOU REAP";
		String wordToBeDeleted="SO";
		int wordPositionInSentence=4;
		String actualString=removeSpaces.identifyAndRemoveSpacesInString(input,wordToBeDeleted,wordPositionInSentence);
		System.out.println(actualString);
		String expectedString="AS YOU SOW, SO YOU REAP ";
		assertEquals(expectedString,  actualString);
				
	}

	
}
