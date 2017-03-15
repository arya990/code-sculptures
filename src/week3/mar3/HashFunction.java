package week3.mar3;

//implement HashFunction
public class HashFunction {
	private static int mod = 0;
	private static int array[] = new int[10];

	public static void main(String[] args) {
		HashFunction hash = new HashFunction();
		hash.put(3);
		hash.put(4);
		hash.put(5);
		hash.search(4);
		for (int i = 0; i <= array.length - 1; i++) {
			System.out.println("value at" + "[" + i + "] = " + array[i]);
		}
	}

	void search(int input) {
		if (array[mod - 1] == input) {
			System.out.println("Seaarch found at index array[" + (mod - 1) + "]");
		} else {
			System.out.println("Seaarch not found");
		}
	}

	void hashfunction(int input) {
		int n = array.length;
		if (n <= 11 && input > 0) {
			mod = input % 11;
			array[mod] = input;
		} else {
			mod = input % (array.length - 1);
			array[mod] = input;
		}
	}

	void put(int input) {
		hashfunction(input);
	}
}
