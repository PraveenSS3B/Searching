package in.Searching;

public class Count1sInSortedArray {

	public static void main(String[] args) {
		int arr[] = { 0, 0, 0, 1, 1, 1, 1 };

		System.out.println(find_Naive(arr, arr.length));
		System.out.println(find_Better(arr, arr.length));
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
