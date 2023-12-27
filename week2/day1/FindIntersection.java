package week2.day1;

public class FindIntersection {

	public static void main(String[] args) {
		int a[] = { 3, 2, 11, 4, 6, 7 };
		int b[] = { 1, 2, 8, 4, 9, 7 };

		FindIntersection findint = new FindIntersection();

		findint.find(a, b);

	}

	public void find(int[] array1, int[] array2) {
		System.out.println("The intersection elements between the given arrays are");
		for (int i = 0; i <= array1.length - 1; i++) {
			for (int j = 0; j <= array1.length - 1; j++) {
				if (array1[i] == array2[j]) {
					System.out.println(array1[i]);
				}
			}
		}

	}

}
