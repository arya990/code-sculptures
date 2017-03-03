package week3.feb27;

/*You are given following Data points:
Userid
Movieid
Rating
timestamp
Model  a class based on above parameters
*/
public class ModelClass {

	private int Userid;
	private String movieid;
	private int rating;
	private int timestamp;

	public void setUserId(int Userid) {
		this.Userid = Userid;
	}

	public int getUserId() {
		return Userid;
	}

	public void setMovieid(String movieid) {
		this.movieid = movieid;
	}

	public String getMovieid() {
		return movieid;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getRating() {
		return rating;
	}

	public void setTimestamp(int timestamp) {
		this.timestamp = timestamp;
	}

	public int getTimestamp() {
		return timestamp;
	}

	public static void main(String[] args) {
		ModelClass m = new ModelClass();
		m.setUserId(111);
		m.setMovieid("ismail");
		m.setRating(3);
		m.setTimestamp(2);

		System.out.println(m.getUserId());
		System.out.println(m.getMovieid());
		System.out.println(m.getRating());
		System.out.println(m.getTimestamp());

	}

}
