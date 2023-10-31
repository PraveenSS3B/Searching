package in.Searching;

public class FirstOccurrenceIndexInSortedArray {

	public static void main(String[] args) {
//		int arr[] = { 1, 2, 2, 4, 5, 6, 6, 6, 7, 7, 8 };

		int arr[] = { 5, 5, 5 };

		int key = 5;

		System.out.println(find(arr, arr.length, key));

	}

	// Naive Solution T.C - O(n) ; A.S - O(1)
	private static int find(int[] arr, int n, int key) {
		for (int i = 0; i < n; i++) {
			if (arr[i] == key)
				return i;
		}

		return -1;

	}

}
