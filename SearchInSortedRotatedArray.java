package in.Searching;

public class SearchInSortedRotatedArray {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 8, 9 };

		int x = 32;

		long start = System.currentTimeMillis();
		System.out.println(find_Naive(arr, x));
		long end = System.currentTimeMillis();
		System.out.println("Naive Sol Time Taked : " + (end - start) + " ms");

		start = System.currentTimeMillis();
		System.out.println(find_Efficient(arr, x));
		end = System.currentTimeMillis();
		System.out.println("Efficient Sol Time Taked : " + (end - start) + " ms");

	}

	private static int find_Efficient(int[] arr, int x) {
		int low = 0, high = arr.length - 1;

		while (low <= high) {
			// Binary Search
			int mid = low + (high - low) / 2;

			if (arr[mid] == x)
				return mid;
			// End Of Normal Binary Search

			// Check Left Half Sorted
			else if (arr[low] <= arr[mid]) {
				if (x >= arr[low] && x < arr[mid])
					high = mid - 1;
				else
					low = mid + 1;
			}

			// Check Right Half Sorted
			else {
				if (x > arr[mid] && x <= arr[high])
					low = mid + 1;
				else
					high = mid - 1;
			}
		}

		return -1;

	}

	private static int find_Naive(int[] arr, int x) {

		for (int i = 0; i < arr.length; i++)
			if (arr[i] == x)
				return i;

		return -1;
	}

}
