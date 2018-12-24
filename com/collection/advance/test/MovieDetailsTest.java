package com.collection.advance.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.collection.advance.MovieDetails;
import com.collection.advance.MovieDetailsList;

public class MovieDetailsTest {

	@Test
	public void testAddMovieName() {
		MovieDetailsList movieDetailsList = new MovieDetailsList();
		movieDetailsList.addMovie("Robot 2.0", "Rajnikant", "Aishwarya Rai","genere1");
		movieDetailsList
				.addMovie("Krish 3", "Hrutik Roshan", "Priyanka Chopra","genere2");
		movieDetailsList.addMovie("Dhoom 3", "Abhishek ", "Katrina","genere3");
		String expected="[MovieDetails [movieName=Robot 2.0, leadActor=Rajnikant, leadActress=Aishwarya Rai], MovieDetails [movieName=Krish 3, leadActor=Hrutik Roshan, leadActress=Priyanka Chopra], MovieDetails [movieName=Dhoom 3, leadActor=Abhishek , leadActress=Katrina]]";
		assertEquals(expected, movieDetailsList.getMovieDetailsArrayList().toString());
		
	}


	@Test
	public void testRemoveMovieName() {
		MovieDetailsList movieDetailsList = new MovieDetailsList();
		movieDetailsList.addMovie("Robot 2.0", "Rajnikant", "Aishwarya Rai","genere1");
		movieDetailsList
				.addMovie("Krish 3", "Hrutik Roshan", "Priyanka Chopra","genere2");
		movieDetailsList.addMovie("Dhoom 3", "Abhishek ", "Katrina","genere3");
		String expected="[MovieDetails [movieName=Robot 2.0, leadActor=Rajnikant, leadActress=Aishwarya Rai], MovieDetails [movieName=Krish 3, leadActor=Hrutik Roshan, leadActress=Priyanka Chopra]]";
		
		movieDetailsList.removeMovie("Dhoom 3");

		assertEquals(expected,movieDetailsList.getMovieDetailsArrayList().toString());
		
	}


	@Test
	public void testRemoveAllMovie() {
		MovieDetailsList movieDetailsList = new MovieDetailsList();
		movieDetailsList.addMovie("Robot 2.0", "Rajnikant", "Aishwarya Rai","genere1");
		movieDetailsList
				.addMovie("Krish 3", "Hrutik Roshan", "Priyanka Chopra","genere2");
		movieDetailsList.addMovie("Dhoom 3", "Abhishek ", "Katrina","genere3");
		String expected="[]";
		
		movieDetailsList.removeAllMovies();

		assertEquals(expected,movieDetailsList.getMovieDetailsArrayList().toString());
		
	}


	@Test
	public void testFindMovieByGenre() {
		MovieDetailsList movieDetailsList = new MovieDetailsList();
		movieDetailsList.addMovie("Robot 2.0", "Rajnikant", "Aishwarya Rai","genere1");
		movieDetailsList
				.addMovie("Krish 3", "Hrutik Roshan", "Priyanka Chopra","genere2");
		movieDetailsList.addMovie("Dhoom 3", "Abhishek ", "Katrina","genere3");
		String expected="MovieDetails [movieName=Krish 3, leadActor=Hrutik Roshan, leadActress=Priyanka Chopra]";
				
		assertEquals(expected,movieDetailsList.findMovieByGenre("genere2").toString());
		
	}



	@Test
	public void testFindMovieByMovieName() {
		MovieDetailsList movieDetailsList = new MovieDetailsList();
		movieDetailsList.addMovie("Robot 2.0", "Rajnikant", "Aishwarya Rai","genere1");
		movieDetailsList
				.addMovie("Krish 3", "Hrutik Roshan", "Priyanka Chopra","genere2");
		movieDetailsList.addMovie("Dhoom 3", "Abhishek ", "Katrina","genere3");

		String expected="MovieDetails [movieName=Dhoom 3, leadActor=Abhishek , leadActress=Katrina]";
		assertEquals(expected,movieDetailsList.findMovieByMovieName("Dhoom 3").toString());
		
	}

	
	
	@Test
	public void testSortByMovieName() {
		MovieDetailsList movieDetailsList = new MovieDetailsList();
		movieDetailsList.addMovie("Robot 2.0", "Rajnikant", "Aishwarya Rai","genere1");
		movieDetailsList.addMovie("Krish 3", "Hrutik Roshan", "Priyanka Chopra","genere2");
		movieDetailsList.addMovie("Dhoom 3", "Abhishek ", "Katrina","genere3");
			
		String expected="[MovieDetails [movieName=Dhoom 3, leadActor=Abhishek , leadActress=Katrina], MovieDetails [movieName=Krish 3, leadActor=Hrutik Roshan, leadActress=Priyanka Chopra], MovieDetails [movieName=Robot 2.0, leadActor=Rajnikant, leadActress=Aishwarya Rai]]";
		assertEquals(expected, movieDetailsList.sort(MovieDetailsList.SORT_BY_MOVIE_NAME).toString());
	}
	

	@Test
	public void testSortByMovieLeadActor() {
		MovieDetailsList movieDetailsList = new MovieDetailsList();
		movieDetailsList.addMovie("Robot 2.0", "Rajnikant", "Aishwarya Rai","genere1");
		movieDetailsList.addMovie("Krish 3", "Hrutik Roshan", "Priyanka Chopra","genere2");
		movieDetailsList.addMovie("Dhoom 3", "Abhishek ", "Katrina","genere3");
			
		String expected="[MovieDetails [movieName=Dhoom 3, leadActor=Abhishek , leadActress=Katrina], MovieDetails [movieName=Krish 3, leadActor=Hrutik Roshan, leadActress=Priyanka Chopra], MovieDetails [movieName=Robot 2.0, leadActor=Rajnikant, leadActress=Aishwarya Rai]]";
		assertEquals(expected, movieDetailsList.sort(MovieDetailsList.SORT_BY_LEAD_ACTOR).toString());
	}
	

	@Test
	public void testSortByMovieLeadActress() {
		MovieDetailsList movieDetailsList = new MovieDetailsList();
		movieDetailsList.addMovie("Robot 2.0", "Rajnikant", "Aishwarya Rai","genere1");
		movieDetailsList.addMovie("Krish 3", "Hrutik Roshan", "Priyanka Chopra","genere2");
		movieDetailsList.addMovie("Dhoom 3", "Abhishek ", "Katrina","genere3");
			
		String expected="[MovieDetails [movieName=Robot 2.0, leadActor=Rajnikant, leadActress=Aishwarya Rai], MovieDetails [movieName=Dhoom 3, leadActor=Abhishek , leadActress=Katrina], MovieDetails [movieName=Krish 3, leadActor=Hrutik Roshan, leadActress=Priyanka Chopra]]";
		assertEquals(expected, movieDetailsList.sort(MovieDetailsList.SORT_BY_LEAD_ACTRESS).toString());
	}
	
}
