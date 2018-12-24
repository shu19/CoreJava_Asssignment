package com.collection.advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * b. Movie_DetailsList class should have method add_movie(), remove_movie(),
 * remove_AllMovies(), find_movie_By_mov_Name(), find_movie_By_Genre()
 * 
 * @author shuraut
 *
 */

public class MovieDetailsList {

	public static final int SORT_BY_MOVIE_NAME = 1;
	public static final int SORT_BY_LEAD_ACTOR = 2;
	public static final int SORT_BY_LEAD_ACTRESS = 3;

	private ArrayList<MovieDetails> movieDetailsArrayList;

	public ArrayList<MovieDetails> getMovieDetailsArrayList() {
		return movieDetailsArrayList;
	}

	public MovieDetailsList() {
		movieDetailsArrayList = new ArrayList<MovieDetails>();
	}

	public void addMovie(String movieName, String leadActor, String leadActress,String genere) {
		movieDetailsArrayList.add(new MovieDetails(movieName, leadActor,
				leadActress,genere));
	}

	public void removeMovie(String movieName) {
		for (int index = 0; index < movieDetailsArrayList.size(); index++) {
			MovieDetails model = movieDetailsArrayList.get(index);
			if (model.getMovieName().equals(movieName)) {
				movieDetailsArrayList.remove(index);
			}
		}
	}

	public void removeAllMovies() {
		movieDetailsArrayList.clear();
	}

	public MovieDetails findMovieByMovieName(String movieName) {
		for (int index = 0; index < movieDetailsArrayList.size(); index++) {
			MovieDetails model = movieDetailsArrayList.get(index);
			if (model.getMovieName().equals(movieName)) {
				return movieDetailsArrayList.get(index);
			}
		}

		return null;
	}

	public MovieDetails findMovieByGenre(String genere) {
		
		for (int index = 0; index < movieDetailsArrayList.size(); index++) {
			MovieDetails model = movieDetailsArrayList.get(index);
			if (model.getGenre().equals(genere)) {
				return movieDetailsArrayList.get(index);
			}
		}
		return null;
	}

	public ArrayList<MovieDetails> sort(int sortMethod) {
		switch (sortMethod) {
		case SORT_BY_MOVIE_NAME:
			Collections.sort(movieDetailsArrayList,
					new Comparator<MovieDetails>() {

				@Override
				public int compare(MovieDetails m1, MovieDetails m2) {
					return m1.getMovieName().compareTo(
							m2.getMovieName());
				}
			});
			return movieDetailsArrayList;
		case SORT_BY_LEAD_ACTOR:
			Collections.sort(movieDetailsArrayList,
					new Comparator<MovieDetails>() {

				@Override
				public int compare(MovieDetails m1, MovieDetails m2) {
					return m1.getLeadActor().compareTo(
							m2.getLeadActor());
				}
			});
			return movieDetailsArrayList;
		case SORT_BY_LEAD_ACTRESS:
			Collections.sort(movieDetailsArrayList,
					new Comparator<MovieDetails>() {

				@Override
				public int compare(MovieDetails m1, MovieDetails m2) {
					return m1.getLeadActress().compareTo(
							m2.getLeadActress());
				}
			});
			return movieDetailsArrayList;

		default:
			return movieDetailsArrayList;
		}

	}

}
