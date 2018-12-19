package javaClassesAndObjects;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;

/**
 * 
 * Complete the implementation of the given Date class and test it by writing TestCases using JUnit:-



		class Date { 
			private int d, m, y; // data members to store the day, month and year of a date.
			public Date(int d, int m, int y) //constructor to initialize Date objects
			{
				//initialize d, m, y of the current object using the d, m, y parameters. 
			}
			public String toString()// method to get the value of a Date object printed
			{
				//return the value of a Date object as a String in d/m/y format.
			}
			public boolean isSmaller(Date d)// method to check whether a date is smaller than the other 
			{
				//If the value of invoking Date object is smaller than the given object, true is returned otherwise false is returned.
			}
			public int[] diff(Date d) //method to find out the difference of days, months and years in two dates.
			{
				//The difference of days, months and years in the invoking and parameter Date objects 
				//is obtained and returned in an int array. The first element of the array should represent
				//difference of days; second one, the difference of months and the third one, the difference of years.
			}
		}
 * 
 * @author shuraut
 *
 */

public class Date {

	private int d, m, y; // data members to store the day, month and year of a date.
	public Date(int d, int m, int y) //constructor to initialize Date objects
	{
		this.d=d;
		this.m=m;
		this.y=y;
		//initializes d, m, y of the current object using the d, m, y parameters. 
	}
	public Date() {
		// TODO Auto-generated constructor stub
	}
	public String toString()// method to get the value of a Date object printed
	{
		
		//returns the value of a Date object as a String in d/m/y format.
		return d+"/"+m+"/"+y;
	}
	public boolean isSmaller(Date d)// method to check whether a date is smaller than the other 
	{
		//If the value of invoking Date object is smaller than the given object, true is returned otherwise false is returned.
		java.util.Date utilDateD1 = null;
		java.util.Date utilDateD2 = null;
		
		try {
			utilDateD1 = new SimpleDateFormat("dd/MM/yyyy").parse(d+"/"+m+"/"+y);
			utilDateD2 = new SimpleDateFormat("dd/MM/yyyy").parse(d.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		java.sql.Date sqlDateD1 = new java.sql.Date(utilDateD1.getTime());
		java.sql.Date sqlDateD2 = new java.sql.Date(utilDateD2.getTime());
		

		LocalDate ld = LocalDate.parse("2017-11-10");

		LocalDate d1date = new java.sql.Date(sqlDateD1.getTime()).toLocalDate();
		LocalDate d2Date = new java.sql.Date(sqlDateD2.getTime()).toLocalDate();
		Period period = Period.between(d2Date, d1date);

		if(period.getYears()<=0 || period.getMonths()<=0 || period.getDays()<=0){
			return true;
		}else{
			return false;
		}
	}
	public int[] diff(Date d1,Date d2) //method to find out the difference of days, months and years in two dates.
	{
		

		java.util.Date utilDateD1 = null;
		java.util.Date utilDateD2 = null;
		
		try {
			utilDateD1 = new SimpleDateFormat("dd/MM/yyyy").parse(d1.toString());
			utilDateD2 = new SimpleDateFormat("dd/MM/yyyy").parse(d2.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		java.sql.Date sqlDateD1 = new java.sql.Date(utilDateD1.getTime());
		java.sql.Date sqlDateD2 = new java.sql.Date(utilDateD2.getTime());
		
		LocalDate d1date = new java.sql.Date(sqlDateD1.getTime()).toLocalDate();
		LocalDate d2Date = new java.sql.Date(sqlDateD2.getTime()).toLocalDate();
		Period period = Period.between(d2Date, d1date);
	
		//The difference of days, months and years in the invoking and parameter Date objects 
		//is obtained and returned in an int array. The first element of the array should represent
		//difference of days; second one, the difference of months and the third one, the difference of years.
		int dates[]=new int[3];
		dates[0]=Math.abs(period.getDays());
		dates[1]=Math.abs(period.getMonths());
		dates[2]=Math.abs(period.getYears());
		return dates;
	}
	
}
