package in.Searching;

public class FirstOccurrenceIndexInSortedArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 4, 5, 6, 6, 6, 7, 7, 8 };

//		int arr[] = { 5, 5, 5 };

		int key = 6;

		System.out.println(find(arr, arr.length, key));

		System.out.println(find_Recursive(arr, 0, arr.length - 1, key));

	}

	private static int find_Recursive(int[] arr, int low, int high, int key) {
		if (low > high)
			return -1;

		int mid = low + (high - low) / 2;

		if (arr[mid] > key)
			return find_Recursive(arr, low, mid - 1, key);

		else if (arr[mid] < key)
			return find_Recursive(arr, mid + 1, high, key);

		else {
			// checking that mid element is first occurrence => arr[mid] != arr[mid - 1]
			// above cond. throws outofboundsexception when mid == 0, so we used " || "
			if (mid == 0 || arr[mid] != arr[mid - 1])
				return mid;
			else
				return find_Recursive(arr, low, mid - 1, key);
		}

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
