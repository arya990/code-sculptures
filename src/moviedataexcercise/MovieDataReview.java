package moviedataexcercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * As Explained there’s a file  Vote.txt in data_and_logistics directory. Which is tab separated. It has following data points
UserId
MovieId
Rating
Junk
TimeStamp

Based on above data complete following tasks

Model a class in Java/Python to suit the data
Read the file using the modelled class and 
Find total number of Unique Users
Find total number of Unique Movies
Find  10 Movies with Highest Rating
Find 10 Movies with Lowest Rating
Find 10 Users who watched most movies
Find 10 Users who watched less movies

 */
public class MovieDataReview {

	public static void main(String[] args) {

		ArrayList<ModelData> datas = new ArrayList<ModelData>();
		Set<Integer> list1 = new HashSet<Integer>();
		Set<Integer> list2 = new HashSet<Integer>();
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		ArrayList<Integer> list4 = new ArrayList<Integer>();

		Map<Integer, Integer> map1 = new HashMap<>();

		Double max_rating = (double) Float.MIN_VALUE;
		Double min_rating = (double) Float.MAX_VALUE;
		int value = 0;

		try {
			FileReader file = new FileReader("C:\\Users\\basha\\Desktop\\Vote.txt");
			BufferedReader br = new BufferedReader(file);

			String line = " ";
			while ((line = br.readLine()) != null) {
				ModelData data = new ModelData();

				String[] str = line.split("\t");
				data.setUserId(Integer.parseInt(str[0]));
				data.setMovieid(Integer.parseInt(str[1]));
				data.setRating(Double.parseDouble(str[2]));
				data.setJunk(Double.parseDouble(str[3]));
				data.setTimestamp(str[4]);

				datas.add(data);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (ModelData a : datas) {
			list1.add(a.getUserId());
			list2.add(a.getMovieid());
			// System.out.println(a.getUserId());
			if (a.getRating() > max_rating) {
				max_rating = a.getRating();
			}
			if (a.getRating() < min_rating) {
				min_rating = a.getRating();
			}
		}
		for (ModelData m : datas) {
			if (max_rating == m.getRating()) {
				list3.add(m.getMovieid());
			} else if (m.getRating() == 0.0) {
				list4.add(m.getMovieid());
			}
		}

		for (ModelData m : datas) {
			if (!map1.containsKey(m.getUserId())) {
				map1.put(m.getUserId(), 1);
				value = 0;
			} else {
				value = value + 1;
				map1.put(m.getUserId(), value);
			}

		}

		Set<Entry<Integer, Integer>> set = map1.entrySet();
		List<Entry<Integer, Integer>> list5 = new ArrayList<Entry<Integer, Integer>>(set);
		Collections.sort(list5, new Comparator<Map.Entry<Integer, Integer>>() {
			@Override
			public int compare(Map.Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return (o2.getValue()).compareTo(o1.getValue());
			}
		});

		List<Entry<Integer, Integer>> list6 = new ArrayList<Entry<Integer, Integer>>(set);
		Collections.sort(list6, new Comparator<Map.Entry<Integer, Integer>>() {
			@Override
			public int compare(Map.Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		System.out.println(max_rating);
		System.out.println(min_rating);

		System.out.println("number of unique users:" + list1.size());
		System.out.println("number of unique movies:" + list2.size());

		System.out.println("Find 10 Movies with Highest Rating");
		for (int i = 0; i < 10; i++) {
			System.out.print(list3.get(i) + " ");
		}
		System.out.println();
		System.out.println("Find 10 Movies with Lowest Rating");
		for (int i = 0; i < 10; i++) {
			System.out.print(list4.get(i) + " ");
		}
		System.out.println();
		System.out.println("Find 10 Users who watched most movies");
		// System.out.println(map1);
		for (int i = 0; i < 10; i++) {
			System.out.print(list5.get(i) + "  ");
		}
		System.out.println();
		System.out.println("Find 10 Users who watched less movies");
		for (int i = 0; i < 10; i++) {
			System.out.print(list6.get(i) + "  ");
		}
		System.out.println();

	}
}
