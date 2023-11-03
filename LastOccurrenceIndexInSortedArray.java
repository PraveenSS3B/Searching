package in.Searching;

public class LastOccurrenceIndexInSortedArray {

	public static void main(String[] args) {
		int arr[] = { 5, 8, 8, 10, 10, 12 };

		int x = 10;

		System.out.println(find_Naive(arr, arr.length, x));
		
		System.out.println(find_Recursive(arr, 0, arr.length - 1, x));

	}

	private static int find_Recursive(int[] arr, int low, int high, int x) {
		
		if(low > high)
			return -1;
		
		int mid = low + (high - low) / 2;
		
		if(arr[mid] > x)
			return find_Recursive(arr, low, mid - 1, x);
		
		else if(arr[mid] < x)
			return find_Recursive(arr, mid + 1, high, x);
		
		else
		{
			if(mid == arr.length - 1 || arr[mid] != arr[mid + 1])
				return mid;
			
			else
				return find_Recursive(arr, mid + 1, high, x);
		}
		
	}

	private static int find_Naive(int[] arr, int n, int x) {

		int index = -1;

		for (int i = 0; i < n; i++) {
			if (arr[i] > x)
				return index;

			else if (arr[i] == x) {
				index = i;
			}
		}

		return index;

	}

}
