package moviedataexcercise;
import java.util.Date;

/*You are given following Data points:
		Userid
		Movieid
		Rating
		timestamp
		Model  a class based on above parameters
		*/
public class ModelClass1 {

	
			private int Userid;
			private int  movieid;
			private double rating;
			private Date timestamp;

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

			public void setTimestamp(Date timestamp) {
				this.timestamp = timestamp;
			}

			public Date getTimestamp() {
				return timestamp;
			}

			public static void main(String[] args) {
				ModelClass1 m = new ModelClass1();
				m.setUserId(111);
				m.setMovieid(1);
				m.setRating(3);
				m.getTimestamp();

				System.out.println(m.getUserId());
				System.out.println(m.getMovieid());
				System.out.println(m.getRating());
				System.out.println(m.getTimestamp());

			}

		

	

}

