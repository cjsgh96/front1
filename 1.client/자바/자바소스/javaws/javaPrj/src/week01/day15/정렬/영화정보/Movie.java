package week01.day15.정렬.영화정보;

public class Movie {
	String name;
	String genre;
	int ranking;
	String director;
	String running_time;
	
	
	public Movie(String name, String genre, int ranking, String director, String running_time) {
		super();
		this.name = name;
		this.genre = genre;
		this.ranking = ranking;
		this.director = director;
		this.running_time = running_time;
	}
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Movie [name=" + name + ", genre=" + genre + ", ranking=" + ranking + ", director=" + director
				+ ", running_time=" + running_time + "]";
	}
	
	
	
}
