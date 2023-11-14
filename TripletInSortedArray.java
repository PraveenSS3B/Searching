package in.Searching;

public class TripletInSortedArray {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 8, 9, 20, 40 };

		int x = 32;

		find_Naive(arr, arr.length, x);
	}

	private static void find_Naive(int[] arr, int n, int x) {

		for (int i = 0; i < n - 2; i++)
			for (int j = i + 1; j < n - 1; j++)
				for (int k = j + 1; k < n; k++)
					if (arr[i] + arr[j] + arr[k] == x)
						System.out.println("Triplets : " + arr[i] + ", " + arr[j] + ", " + arr[k]);
	}

}
