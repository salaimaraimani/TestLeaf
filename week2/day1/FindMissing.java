package week2.day1;

import java.util.Arrays;

public class FindMissing {

	public static void main(String[] args) {
		int[] array = { 1, 4, 3, 2, 8, 6, 7 };

		FindMissing find = new FindMissing();
		find.missing(array);

	}

	public void missing(int[] arr) {
		Arrays.sort(arr);
		for (int i = arr[0]; i <= arr.length; i++) {

			if (i != arr[i - 1]) {
				System.out.println("The missing element is: " + i);
				break;
				

			}
		}
	}

}
