package com.collection.basic;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

import org.junit.Test;

/**
 * This class tests all the basic collection
 * 
 * @author shuraut
 *
 */
public class BasicCollectionTest {

	/**
	 * Create classes for the below objects with the fields specified below.
	 * Create three different instances for each type and add them to a
	 * collection. Now, read from these collection and print each attribute in
	 * console.
	 */
	@Test
	public void testCarArrayList() {

		Car tata = new Car("TATA", "Tiago", "2016", 600000);
		Car maruti = new Car("Maruti", "Baleno", "2017", 700000);
		Car toyota = new Car("Toyota", "cruz", "2018", 1000000);

		List<Car> cars = new ArrayList<Car>();
		cars.add(tata);
		cars.add(maruti);
		cars.add(toyota);
		String expected = "[Car [make=TATA, model=Tiago, year=2016, price=600000], Car [make=Maruti, model=Baleno, year=2017, price=700000], Car [make=Toyota, model=cruz, year=2018, price=1000000]]";
		assertEquals(expected, cars.toString());

	}

	@Test
	public void testLaptopArrayList() {

		Laptop dell = new Laptop("Dell", "Vostro", "Windows", "Intel");
		Laptop hp = new Laptop("Hp", "hps", "Windows", "Intel");
		Laptop lenovo = new Laptop("Lenovo", "len", "Windows", "Intel");

		List<Laptop> laptops = new ArrayList<Laptop>();
		laptops.add(dell);
		laptops.add(hp);
		laptops.add(lenovo);

		String expected = "[Laptop [company=Dell, model=Vostro, operatingSystem=Windows, processor=Intel], Laptop [company=Hp, model=hps, operatingSystem=Windows, processor=Intel], Laptop [company=Lenovo, model=len, operatingSystem=Windows, processor=Intel]]";
		assertEquals(expected, laptops.toString());
	}

	@Test
	public void testSchoolArrayList() {

		School school1 = new School("ABC", "Mumbai", "Mumbai", 2);
		School school2 = new School("XYZ", "Pune", "Pune", 1);
		School school3 = new School("PQR", "Thane", "Thane", 3);

		List<School> schools = new ArrayList<School>();
		schools.add(school1);
		schools.add(school2);
		schools.add(school3);

		String expected = "[School [name=ABC, city=Mumbai, District=Mumbai, greatSchoolRanking=2], School [name=XYZ, city=Pune, District=Pune, greatSchoolRanking=1], School [name=PQR, city=Thane, District=Thane, greatSchoolRanking=3]]";
		assertEquals(expected, schools.toString());
	}

	@Test
	public void testTelevisionArrayList() {

		Television mi = new Television("MI", "LED", 15000, false);
		Television samsung = new Television("Samsung", "LED", 50000, true);
		Television sony = new Television("Sony", "LED", 25000, false);

		List<Television> televisions = new ArrayList<Television>();
		televisions.add(mi);
		televisions.add(samsung);
		televisions.add(sony);

		String expected = "[Television [company=MI, type=LED, price=15000, is3Denabled=false], Television [company=Samsung, type=LED, price=50000, is3Denabled=true], Television [company=Sony, type=LED, price=25000, is3Denabled=false]]";
		assertEquals(expected, televisions.toString());
	}

	@Test
	public void testCellPhoneArrayList() {

		CellPhone redmi = new CellPhone("Xiaomi", "Redmi", "Note 4", "Android",
				10000);
		CellPhone nokia = new CellPhone("Nokia", "N8", "16Mp Camera",
				"Android", 15000);
		CellPhone oppo = new CellPhone("Opppo", "F7", "24Mp Camera", "Android",
				25000);

		List<CellPhone> cellPhones = new ArrayList<CellPhone>();
		cellPhones.add(redmi);
		cellPhones.add(nokia);
		cellPhones.add(oppo);

		String expected = "[CellPhone [company=Xiaomi, model=Redmi, description=Note 4, operatingSystems=Android, price=10000], CellPhone [company=Nokia, model=N8, description=16Mp Camera, operatingSystems=Android, price=15000], CellPhone [company=Opppo, model=F7, description=24Mp Camera, operatingSystems=Android, price=25000]]";
		assertEquals(expected, cellPhones.toString());
	}

	@Test
	public void testHashSet() {

		Car tata = new Car("TATA", "Tiago", "2016", 600000);
		Car maruti = new Car("Maruti", "Baleno", "2017", 700000);
		Car tataTiago = new Car("TATA", "Tiago", "2016", 600000);

		HashSet<Car> cars = new HashSet<Car>();
		cars.add(tata);
		cars.add(maruti);
		cars.add(tataTiago);

		String expected = "[Car [make=Maruti, model=Baleno, year=2017, price=700000], Car [make=TATA, model=Tiago, year=2016, price=600000]]";
		assertEquals(expected, cars.toString());

	}

	/**
	 * Add all the names of our class students randomly to a collection, iterate
	 * through them and print. Observe that collection is maintaining the order
	 * that you add.
	 */

	@Test
	public void testStudentArrayList() {
		ArrayList<Student> studentsArrayList = new ArrayList<Student>();
		studentsArrayList.add(new Student("Rohan", "Banana"));
		studentsArrayList.add(new Student("Tushar", "Mango"));
		studentsArrayList.add(new Student("Shubham", "Apple"));

		String expected = "[Student [name=Rohan, favoriteFruits=Banana], Student [name=Tushar, favoriteFruits=Mango], Student [name=Shubham, favoriteFruits=Apple]]";
		assertEquals(expected, studentsArrayList.toString());
	}

	/**
	 * Add all the names of our class students randomly to a collection, iterate
	 * through them and print. Observe that collection keeps these elements in a
	 * natural order.
	 */

	@Test
	public void testStudentTreeSet() {
		TreeSet<Student> studentsTreeSet = new TreeSet<Student>();
		studentsTreeSet.add(new Student("Rohan", "Banana"));
		studentsTreeSet.add(new Student("Tushar", "Mango"));
		studentsTreeSet.add(new Student("Shubham", "Apple"));

		String expected = "[Student [name=Rohan, favoriteFruits=Banana], Student [name=Shubham, favoriteFruits=Apple], Student [name=Tushar, favoriteFruits=Mango]]";
		assertEquals(expected, studentsTreeSet.toString());
	}

	/**
	 * Create few instances of Car and add them to a collection. Have Car
	 * implements Comparable interface and override compareTo() to order them by
	 * ascending order of make of the Car. Observe the fact that you need to
	 * provide the order criteria in compareTo().
	 */

	@Test
	public void testCarTreeSet() {

		Car tata = new Car("TATA", "Tiago", "2016", 600000);
		Car maruti = new Car("Maruti", "Baleno", "2017", 700000);
		Car toyota = new Car("Toyota", "cruz", "2018", 1000000);

		TreeSet<Car> treeSet = new TreeSet<Car>();
		treeSet.add(tata);
		treeSet.add(maruti);
		treeSet.add(toyota);

		String expected = "[Car [make=Maruti, model=Baleno, year=2017, price=700000], Car [make=TATA, model=Tiago, year=2016, price=600000], Car [make=Toyota, model=cruz, year=2018, price=1000000]]";

		assertEquals(expected, treeSet.toString());

	}

	/**
	 * Create a simple map to store all of our class students’ names and their
	 * favorite fruits. Try to get their favorite fruit by giving their name.
	 * Also, list all the names and their favorite fruits saperately.
	 */

	@Test
	public void testStudentMap() {

		Map<String, Student> studentMap = new HashMap<>();
		studentMap.put("Shubham", new Student("Shubham", "Apple"));
		studentMap.put("Rohan", new Student("Rohan", "Banana"));
		studentMap.put("Tushar", new Student("Tushar", "Mango"));
		studentMap.put("Tejas", new Student("Tejas", "Pineapple"));

		String expected = "{Tejas=Student [name=Tejas, favoriteFruits=Pineapple], Tushar=Student [name=Tushar, favoriteFruits=Mango], Shubham=Student [name=Shubham, favoriteFruits=Apple], Rohan=Student [name=Rohan, favoriteFruits=Banana]}";
		assertEquals(expected, studentMap.toString());

	}

	@Test
	public void testStudentMapGetFavoriteFruitByGivingName() {

		Map<String, Student> studentMap = new HashMap<>();
		studentMap.put("Shubham", new Student("Shubham", "Apple"));
		studentMap.put("Rohan", new Student("Rohan", "Banana"));
		studentMap.put("Tushar", new Student("Tushar", "Mango"));
		studentMap.put("Tejas", new Student("Tejas", "Pineapple"));

		String expected = "Student [name=Rohan, favoriteFruits=Banana]";
		assertEquals(expected, studentMap.get("Rohan").toString());

	}

}
