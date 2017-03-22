package week4.mar18;
//java program for quick sort
public class QuickSort {
	public static  int array[];
	public static int length;
	
	

	public  void quickSort(int low, int high) {
		int i = low;
		int j = high;
		int pivot = array[low +( high-low)/2];

		while (i <= j) {
			while (array[i] < pivot) {
				i++;
			}
			while (pivot < array[j]) {
				j--;
			}
			if (i <= j) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;

				i++;
				j--;
			}
		}
		if (low < j)
			quickSort(low, j);
		if (i < high)
			quickSort(i, high);
	}
	
	 public void sort(int[] inputArr) {
         
	        if (inputArr == null || inputArr.length == 0) {
	            return;
	        }
	        QuickSort.array = inputArr;
	        length = inputArr.length;
	        quickSort(0, length - 1);
	    }

	public static void main(String[] args) {
		int[] input = { 12, 89, 95, 2, 6, 5, 3,5 };
		length = input.length;
		QuickSort sort1= new QuickSort();
		 sort1.sort(input);

//		for (int i : input) {
//			System.out.print(array[i ]+ " ");
//		}

		for (int i = 0; i < input.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
