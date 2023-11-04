package in.Searching;

public class Count1sInSortedArray {

	public static void main(String[] args) {
		int arr[] = { 0, 0, 0, 1, 1, 1, 1 };

		System.out.println(find_Naive(arr, arr.length));
		System.out.println(find_Better(arr, arr.length));
		System.out.println(find_Efficient(arr, arr.length));
	}

	private static int find_Efficient(int[] arr, int n) {
		int low = 0, high = n - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] == 0)
				low = mid + 1;

			else {
				if (mid == 0 || arr[mid] != arr[mid - 1])
					return n - mid;

				else
					high = mid - 1;
			}
		}

		return -1;
	}

	private static int find_Better(int[] arr, int n) {
		int c = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 1) {
				c = n - i;
				break;
			}
		}
		return c;
	}

	private static int find_Naive(int[] arr, int n) {
		int c = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] == 1)
				c++;
		}

		return c;

	}

}
