package javaClassesAndObjects;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CountryTest {

	@Test
	public void testMaxPopulation() {

		Country countries[]={
				new Country("India",100000,500),
				new Country("China",20000,800),
				new Country("USA",5000,400),
				new Country("UK",15000,1000)
		};

		int maxPopulation=0;
		
		for(int i=0;i<countries.length;i++){
			if(maxPopulation<countries[i].getPopulation()){
				maxPopulation=countries[i].getPopulation();
			}
			
		}
		
		assertEquals(100000, maxPopulation);
		
	}

	@Test
	public void testMaxArea() {

		Country countries[]={
				new Country("India",100000,500),
				new Country("China",20000,800),
				new Country("USA",5000,400),
				new Country("UK",15000,1000)
		};
		
		int maxArea=0;
		
		for(int i=0;i<countries.length;i++){
			if(maxArea<countries[i].getArea()){
				maxArea=countries[i].getArea();
			}
			
		}
	
		assertEquals(1000, maxArea);

	}


	@Test
	public void testMaxPopulationDensity() {

		Country countries[]={
				new Country("India",100000,500),
				new Country("China",20000,800),
				new Country("USA",5000,400),
				new Country("UK",15000,1000)
		};
		
		int maxPopulationDensity=0;
		
		for(int i=0;i<countries.length;i++){
			if(maxPopulationDensity<(countries[i].getPopulation()/countries[i].getArea())){
				maxPopulationDensity=countries[i].getPopulation()/countries[i].getArea();
			}
			
		}
	
		assertEquals(200, maxPopulationDensity);

	}
	
	
}
