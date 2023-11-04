package in.Searching;

public class CountOccurrencesInSortedArray {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 20, 20, 30, 30 };

		int x = 20;

		System.out.println(find_Naive(arr, arr.length, x));

	}

	private static int find_Naive(int[] arr, int n, int x) {
		int c = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] == x)
				c++;

			else if (arr[i] > x)
				break;
		}

		return c;
	}

}
