package in.Searching;

public class SquareRoot {

	public static void main(String[] args) {
		int num = 19;

		System.out.println(find_Naive(num));

	}

	private static int find_Naive(int num) {

		int i;
		for (i = 1; i * i <= num; i++) {
		}
		return i - 1;
	}

}
