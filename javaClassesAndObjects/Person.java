package javaClassesAndObjects;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.util.Locale;

/**
 * Complete the implementation of the given class:-


		class Person
		{ 
			private String name; // data member to store the name of a person.
			private Date dob; // data member to store the date of birth of a person.
			public Person(String n, int d, int m, int y) //constructor to initialize Person objects
			{
				//initialize the data members of the current Person object using the parameters. 
			}
			public void display()// method to display the details of a person.
			{
				//Person details should be displayed in the following format:
				//Name: Person Name
				//Date Of Birth: dd/mm/yyyy
				//Age: ... Years, ... Months, ... Days
			}
			public void olderOne(Person p) //method to identify the older of the two persons.
			{
				//Older one of the invoking and given person object is identified and its details are 
				//displayed in the following format:
				//.... is older than .... by ... years, ... months and ... days.
			}
		}
		
		
		
		
		Define the class named PersonTest  which contains main() method. In the main() method, 2 Person objects are created, their details are displayed and the older one among them is identifed and displayed; as follows below:-
		
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

public class Person {

	private String name; // data member to store the name of a person.
	private String dob; // data member to store the date of birth of a person.
	public Person(String n, int d, int m, int y) //constructor to initialize Person objects
	{
		this.name=n;
		this.dob=d+"/"+m+"/"+y;	 
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public void display()// method to display the details of a person.
	{
		System.out.println("Name : "+name+"\n"
						 + "Date Of Birth : "+dob+"\n"
						 + "Age : "+getAge(dob).getYears()+" Years, "+getAge(dob).getMonths()+" Months,"+ getAge(dob).getDays() +" Days\n");
		
	}
	public void olderOne(Person p1,Person p2) //method to identify the older of the two persons.
	{

		//Older one of the invoking and given person object is identified and its details are 
		//displayed in the following format:
		//.... is older than .... by ... years, ... months and ... days.
		
		java.util.Date utilDateP1 = null;
		java.util.Date utilDateP2 = null;
		
		try {
			utilDateP1 = new SimpleDateFormat("dd/MM/yyyy").parse(p1.dob);
			utilDateP2 = new SimpleDateFormat("dd/MM/yyyy").parse(p2.dob);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		java.sql.Date sqlDateP1 = new java.sql.Date(utilDateP1.getTime());
		java.sql.Date sqlDateP2 = new java.sql.Date(utilDateP2.getTime());
		
		LocalDate p1date = new java.sql.Date(sqlDateP1.getTime()).toLocalDate();
		LocalDate p2Date = new java.sql.Date(sqlDateP2.getTime()).toLocalDate();
		Period period = Period.between(p2Date, p1date);

//		System.out.println(period);
		if(period.getYears()<0){
			System.out.println(p1.name+" is older than "+p2.name+" by "+Math.abs(period.getYears()) +" Years, " +Math.abs(period.getMonths())+ " Months, " +Math.abs(period.getDays())+ " Days");
		
		}else{
//			System.out.println(p2.name+" is older than "+p1.name+" by "+period.getYears() +"Years," +period.getMonths()+ "Months," +period.getDays()+ "Days");
			System.out.println(p2.name+" is older than "+p1.name+" by "+Math.abs(period.getYears()) +" Years, " +Math.abs(period.getMonths())+ " Months, " +Math.abs(period.getDays())+ " Days");
		}
	}

	public Period getAge(String dob){
		java.util.Date utilDate = null;
		
		try {
			utilDate = new SimpleDateFormat("dd/MM/yyyy").parse(dob);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
		
		LocalDate today = LocalDate.now();
		LocalDate birthday = new java.sql.Date(sqlDate.getTime()).toLocalDate();
		Period period = Period.between(birthday, today);

		return period;
	}
	
}
