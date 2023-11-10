package in.Searching;

public class SearchInfiniteSizeSortedArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 191, 192, 193, 194, 195,
				196, 197, 198, 199, 200 };

		int num = 30;

		System.out.println(searchPos_Naive(arr, num));

	}

	private static int searchPos_Naive(int[] arr, int num) {
		int i = 0;

		while (true) {
			if (arr[i] == num)
				return i;

			else if (arr[i] > num)
				return -1;
			i++;
		}
	}

}
