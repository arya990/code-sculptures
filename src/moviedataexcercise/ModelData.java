package moviedataexcercise;

/*You are given following Data points:
		Userid
		Movieid
		Rating
		timestamp
		Model  a class based on above parameters
		*/
public class ModelData {

	private int Userid;
	private int movieid;
	private double rating;
	private double junk;
	private String timestamp;

	public void setUserId(int Userid) {
		this.Userid = Userid;
	}

	public int getUserId() {
		return Userid;
	}

	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}

	public int getMovieid() {
		return movieid;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public double getRating() {
		return rating;
	}

	public void setJunk(double junk) {
		this.junk = junk;
	}

	public double getJunk() {
		return junk;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getTimestamp() {
		return timestamp;
	}
}
