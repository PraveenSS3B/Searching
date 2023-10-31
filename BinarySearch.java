package in.Searching;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 10 };

		int key = 10;

		System.out.println(find(arr, arr.length, key));

		System.out.println(find_Recursive(arr, 0, arr.length - 1, key));

	}

	private static int find_Recursive(int[] arr, int low, int high, int key) {

		if (low > high)
			return -1;

		int mid = low + (high - low) / 2;

		if (arr[mid] == key)
			return mid;

		else if (arr[mid] > key)
			return find_Recursive(arr, low, mid - 1, key);

		return find_Recursive(arr, mid + 1, high, key);

	}

	private static int find(int[] arr, int n, int key) {
		int low = 0, high = n - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] == key) {
				return mid;
			}

			else if (arr[mid] > key) {
				high = mid - 1;
			}

			else if (arr[mid] < key) {
				low = mid + 1;
			}
		}

		return -1;
	}

}
