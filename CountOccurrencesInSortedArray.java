package in.Searching;

public class CountOccurrencesInSortedArray {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 20, 20, 30, 30 };

		int x = 20;

		System.out.println(find_Naive(arr, arr.length, x));

		System.out.println(find_Efficient(arr, arr.length, x));

	}

	private static int find_Efficient(int[] arr, int n, int x) {
		int firstOccurenceIndex = firstOccurence(arr, n, x);

		if (firstOccurenceIndex == -1)
			return 0;

		return lastOccurrence(arr, n, x) - firstOccurenceIndex + 1;
	}

	private static int lastOccurrence(int[] arr, int n, int x) {

		int low = 0, high = n - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] > x)
				high = mid - 1;

			else if (arr[mid] < x)
				low = mid + 1;

			else {
				if (mid == n - 1 || arr[mid] != arr[mid + 1])
					return mid;
				else
					low = mid + 1;
			}
		}

		return -1;
	}

	private static int firstOccurence(int[] arr, int n, int x) {

		int low = 0, high = n - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] > x)
				high = mid - 1;

			else if (arr[mid] < x)
				low = mid + 1;

			else {
				if (mid == 0 || arr[mid] != arr[mid - 1])
					return mid;
				else
					high = mid - 1;
			}
		}
		return -1;
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
