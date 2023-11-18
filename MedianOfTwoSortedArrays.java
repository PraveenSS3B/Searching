package in.Searching;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		int a1[] = { 10, 20, 30, 40, 50 };

		int a2[] = { 5, 15, 25, 35, 45 };

		System.out.println(find_Naive(a1, a2, a1.length, a2.length));

	}

	// Naive - T.C - O((n1+n2)log(n1+n2)) ; A.S - O(n1+n2)
	private static float find_Naive(int[] a1, int[] a2, int n1, int n2) {

		int temp[] = new int[n1 + n2];

		for (int i = 0; i < n1; i++) {
			temp[i] = a1[i];
		}

		for (int i = n1; i < n1 + n2; i++) {
			temp[i] = a2[i - n1];
		}

		Arrays.sort(temp);

		if ((n1 + n2) % 2 != 0)
			return temp[(n1 + n2) / 2];

		else {
			float ans = temp[(n1 + n2) / 2] + temp[((n1 + n2) / 2) - 1];

			return ans / 2;
		}
	}

}
