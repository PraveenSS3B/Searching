package in.Searching;

public class LastOccurrenceIndexInSortedArray {

	public static void main(String[] args) {
		int arr[] = { 5, 8, 8, 10, 10, 12 };

		int x = 10;

		System.out.println(find_Naive(arr, arr.length, x));

	}

	private static int find_Naive(int[] arr, int n, int x) {

		int index = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] > x)
				return index;

			else if (arr[i] == x) {
				index = i;
			}
		}

		return index;

	}

}
