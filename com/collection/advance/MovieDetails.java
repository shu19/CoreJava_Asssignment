package com.collection.advance;

/**
 * 2) Create class Movie_Details with field�s mov_Name, lead_actor,
 * lead_actress, and genre add setter and getter method in that class.
 * 
 * a. After creating this class create class Movie_DetailsList class who will
 * maintain all the objects.
 * 
 * b. Movie_DetailsList class should have method add_movie(), remove_movie(),
 * remove_AllMovies(), find_movie_By_mov_Name(), find_movie_By_Genre()
 * 
 * c. Movie_DetailsList should have method which will take an argument that will
 * be use to determine on which to sort
 * 
 * @author shuraut
 *
 */
public class MovieDetails {

	private String movieName;
	private String leadActor;
	private String leadActress;
	private String genre;
	

	/**
	 * @param movieName
	 * @param leadActor
	 * @param leadActress
	 * @param genre
	 */
	public MovieDetails(String movieName, String leadActor, String leadActress,
			String genre) {
		super();
		this.movieName = movieName;
		this.leadActor = leadActor;
		this.leadActress = leadActress;
		this.genre = genre;
	}

	public MovieDetails() {

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((leadActor == null) ? 0 : leadActor.hashCode());
		result = prime * result
				+ ((leadActress == null) ? 0 : leadActress.hashCode());
		result = prime * result
				+ ((movieName == null) ? 0 : movieName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovieDetails other = (MovieDetails) obj;
		if (leadActor == null) {
			if (other.leadActor != null)
				return false;
		} else if (!leadActor.equals(other.leadActor))
			return false;
		if (leadActress == null) {
			if (other.leadActress != null)
				return false;
		} else if (!leadActress.equals(other.leadActress))
			return false;
		if (movieName == null) {
			if (other.movieName != null)
				return false;
		} else if (!movieName.equals(other.movieName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MovieDetails [movieName=" + movieName + ", leadActor="
				+ leadActor + ", leadActress=" + leadActress + "]";
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getLeadActor() {
		return leadActor;
	}

	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}

	public String getLeadActress() {
		return leadActress;
	}

	public void setLeadActress(String leadActress) {
		this.leadActress = leadActress;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	
}
