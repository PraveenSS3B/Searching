package in.Searching;

public class TwoPointer {

	public static void main(String[] args) {
		int arr[] = { 2, 5, 8, 12, 30 };

//		int arr[] = { 2, 4,8,9,11,12,20,30 };

		int x = 17;

		find_Naive(arr, arr.length, x);
	}

	private static void find_Naive(int[] arr, int n, int x) {

		boolean flag = false;

		for (int i = 0; i < n - 1; i++)
			for (int j = i + 1; j < n; j++)
				if (arr[i] + arr[j] == x) {
					System.out.println("Pairs = " + arr[i] + ", " + arr[j]);
					flag = true;
					break;
				}

		if (!flag)
			System.out.println("No Pairs...");
	}

}
