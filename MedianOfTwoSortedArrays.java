package in.Searching;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		int a1[] = { 10, 20, 30, 40, 50 };

		int a2[] = { 5, 15, 25, 35, 45 };

		System.out.println(find_Naive(a1, a2, a1.length, a2.length));

		System.out.println(find_Efficient(a1, a2, a1.length, a2.length));

	}

	private static double find_Efficient(int[] a1, int[] a2, int n1, int n2) {

		int begin = 0, end = n1;

		while (begin <= end) {
			int i1 = begin + (end - begin) / 2;

			int i2 = ((n1 + n2 + 1) / 2) - i1;

			int a1Min_RightSide = (i1 == n1) ? Integer.MAX_VALUE : a1[i1];

			int a1Max_LeftSide = (i1 == 0) ? Integer.MIN_VALUE : a1[i1 - 1];

			int a2Min_RightSide = (i2 == n2) ? Integer.MAX_VALUE : a2[i2];

			int a2Max_LeftSide = (i2 == 0) ? Integer.MIN_VALUE : a2[i2 - 1];

			if (a1Max_LeftSide <= a2Min_RightSide && a2Max_LeftSide <= a1Min_RightSide) {
				if ((n1 + n2) % 2 == 0)
					return ((double) Math.max(a1Max_LeftSide, a2Max_LeftSide)
							+ Math.min(a2Min_RightSide, a1Min_RightSide)) / 2;

				else
					return (double) Math.max(a2Max_LeftSide, a1Max_LeftSide);
			}

			else if (a1Max_LeftSide > a2Min_RightSide)
				end = i1 - 1;
			else
				begin = i1 + 1;
		}
		return 0;

	}

	// Naive - T.C - O((n1+n2)log(n1+n2)) ; A.S - O(n1+n2)
	private static double find_Naive(int[] a1, int[] a2, int n1, int n2) {

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
			double ans = temp[(n1 + n2) / 2] + temp[((n1 + n2) / 2) - 1];

			return ans / 2;
		}
	}

}
