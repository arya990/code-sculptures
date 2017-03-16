package moviedataexcercise;


/*You are given following Data points:
		Userid
		Movieid
		Rating
		timestamp
		Model  a class based on above parameters
		*/
public class ModelData implements Comparable<ModelData> {

	private int userid;
	private int movieid;
	private double rating;
	private double junk;
	private String timestamp;

	public ModelData() {
		userid = 0;
		movieid = 0;
		rating = 0.0;
		junk = 0.0;
		timestamp = " ";
	}

	public ModelData(int userid, int movieid, double rating, double junk, String timestamp) {
		this.userid = userid;
		this.rating = rating;
		this.movieid = movieid;
		this.junk = junk;
		this.timestamp = timestamp;
	}

	public void setUserId(int userid) {
		this.userid = userid;
	}

	public int getUserId() {
		return userid;
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

	public int compareTo(ModelData a) {
		if (rating == a.rating)
			return 0;
		else if (rating > a.rating)
			return -1;
		else  
			return 1;
	}
	
}
