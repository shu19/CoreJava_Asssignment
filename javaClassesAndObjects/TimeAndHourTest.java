package javaClassesAndObjects;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TimeAndHourTest {


	@Test
	public void test() {
		TimeAndHour t1=new TimeAndHour();
		t1.setTime(4, 10);
		TimeAndHour t2=new TimeAndHour();
		t2.setTime(5, 20);
		
		TimeAndHour t3=new TimeAndHour();
		
		String expected="Addition of hours is 9 hours, 30 minutes";
		String actual="Addition of hours is "+t3.sum(t1, t2).getHours()+" hours, "+t3.sum(t1, t2).getMinutes()+" minutes";
		assertEquals(expected, actual);
	}

}
