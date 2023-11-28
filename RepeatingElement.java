package in.Searching;

import java.util.Arrays;

public class RepeatingElement {

	/*
	 * Constraints: Array Size , n >=2 Only one element repeats (any number of
	 * times) All the elements from 0 to max(arr) are present therefore 0 <=
	 * max(arr) <= n-2
	 */

	public static void main(String[] args) {
		int arr[] = { 0, 2, 1, 3, 2, 2 };

		System.out.println(find_SuperNaive(arr, arr.length));
		System.out.println(find_Naive(arr, arr.length));

	}

	private static int find_Naive(int[] arr, int n) {
		Arrays.sort(arr);

		for (int i = 0; i < n - 1; i++)
			if (arr[i] == arr[i + 1])
				return arr[i];
		return -1;
	}

	private static int find_SuperNaive(int[] arr, int n) {
		for (int i = 0; i < n - 1; i++)
			for (int j = i + 1; j < n; j++)
				if (arr[i] == arr[j])
					return arr[i];

		return -1;
	}

}
