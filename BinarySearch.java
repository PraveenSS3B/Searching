package in.Searching;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 10 };

		int key = 3;

		System.out.println(find(arr, arr.length, key));

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
