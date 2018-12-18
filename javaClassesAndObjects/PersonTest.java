package javaClassesAndObjects;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


/**
 * 
		Define the class named PersonTest  which contains main() method. In the main() method, 2 Person objects are created, 
		their details are displayed and the older one among them is identifed and displayed; as follows below:-
		
		NOTE:-Do not forget to write TestCases for method "olderOne(person)".
		
		Let the Person Object be initialized by values ("Ram", 5, 6, 1980) and ("Shyam", 2, 3, 1987) 
		
		First Person Details: 
		Name: Ram
		Date of Birth: 5/6/1980
		Age: ... Years, ... Months, ... Days //actual values as per current date should be displayed.
		
		Second Person Details: 
		Name: Shayam 
		Date of Birth: 2/3/1987
		Age: ... Years, ... Months, ... Days //actual values as per current date should be displayed.
		
		Ram is older than Shyam by 6 Years, 8 Months, 25 Days


 * 
 * @author shuraut
 *
 */
public class PersonTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Person person1=new Person("Ram",5,6,1980);
		Person person2=new Person("Shyam",2,3,1987);
		person1.display();
		person2.display();
		
		Person person3=new Person();
		person3.olderOne(person1, person2);
		
	}

	
}
