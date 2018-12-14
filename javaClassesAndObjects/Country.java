package javaClassesAndObjects;

/**
 * Define a class Country that stores the name of the country, 
 * its population, and its area.
 *  
 * Using that class, write a test program that creates a few countries and stores them in an array and then prints

	The country with the largest area
	The country with the largest population
	The country with the largest population density (people per square mile)
	
	NOTE: Write appropriate TestCases.
	
	-------------------------------------------------------------------------------------------------------------------------------------------------------

 * 
 * @author shuraut
 *
 */

public class Country {

	private String country;
	private int population;
	private int area;
	
		
	public Country(String country, int population, int area) {
		this.country = country;
		this.population = population;
		this.area = area;
	}

	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public int getPopulation() {
		return population;
	}


	public void setPopulation(int population) {
		this.population = population;
	}


	public int getArea() {
		return area;
	}


	public void setArea(int area) {
		this.area = area;
	}

}
