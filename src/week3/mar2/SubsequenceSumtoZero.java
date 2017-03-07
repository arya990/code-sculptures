package week3.mar2;
//Design an O(n log n) algorithm to solve the following problem: Given a sequence of n real numbers, determine whether any contiguous subsequence sums to zero

public class SubsequenceSumtoZero {

	public static void main(String[] args) {

		int array[] = { 3, 3, -3, 1, 6 };
		int length = array.length;
		if (subArrayExists(array, length))
			System.out.println("Found a subarray with 0 sum");
		else
			System.out.println("No Such Sub Array Exists!");

	}

	static boolean subArrayExists(int arr[], int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
			if (sum == 0)
				return true;
		}
		return false;
	}

}
