package in.Searching;

public class PeakElement {

	public static void main(String[] args) {
//		int arr[] = { 5, 10, 20, 15, 7 };

//		int arr[] = { 6, 7, 8, 20, 13 };

		int arr[] = { 1, 2 };

		System.out.println(find_Naive(arr, arr.length));

		System.out.println(find_Efficient(arr, arr.length));
	}

	private static int find_Efficient(int[] arr, int n) {
		int low = 0, high = n - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid] >= arr[mid + 1]))
				return arr[mid];

			if (mid > 0 && arr[mid - 1] >= arr[mid])
				high = mid - 1;

			else
				low = mid + 1;

		}

		return -1;
	}

	private static int find_Naive(int[] arr, int n) {

		if (n == 1)
			return arr[0];

		if (arr[0] >= arr[1])
			return arr[0];

		if (arr[n - 1] >= arr[n - 2])
			return arr[n - 1];

		for (int i = 1; i < n - 1; i++) {
			if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
				return arr[i];

		}
		return -1;

	}
}
