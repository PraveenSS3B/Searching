package in.Searching;

public class SquareRoot {

	public static void main(String[] args) {
		int num = 10;

		System.out.println(find_Naive(num));
		System.out.println(find_Efficient(num));

	}

	private static int find_Efficient(int num) {
		int low = 1, high = num, ans = -1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			int sq = mid * mid;

			if (sq == num)
				return mid;

			else if (sq > num)
				high = mid - 1;

			else {
				low = mid + 1;
				ans = mid;
			}
		}

		return ans;
	}

	private static int find_Naive(int num) {

		int i;
		for (i = 1; i * i <= num; i++) {
		}
		return i - 1;
	}

}
