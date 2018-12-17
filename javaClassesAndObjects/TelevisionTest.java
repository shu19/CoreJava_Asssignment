package javaClassesAndObjects;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
/**
 * 	Design this class, create an instance, turn on, increase and decrease the volume, 
	change channels..get information about state, volume and channel..finally turn it off.

 * @author shuraut
 *
 */
public class TelevisionTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Television sony=new Television();
		sony.changeChannel(Television.INCREASE);
		System.out.println();
	}

}
