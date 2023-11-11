package in.Searching;

public class SearchInSortedRotatedArray {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 8, 9 };

		int x = 30;

		System.out.println(find_Naive(arr, x));

	}

	private static int find_Naive(int[] arr, int x) {

		for (int i = 0; i < arr.length; i++)
			if (arr[i] == x)
				return i;

		return -1;
	}

}
