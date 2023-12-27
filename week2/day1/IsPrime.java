package week2.day1;

public class IsPrime {
	public static void main(String[] args) {

		IsPrime print = new IsPrime();
		print.check(19);
	}

	public void check(int n) {
		if (n <= 1) {
			System.out.println("please enter a number greater than one!");
		} else {
			boolean isPrime = true;
			for (int i = 2; i <= n - 1; i++) {
				if (n % i == 0) {
					isPrime = false;
					break;

				}
			}
			if (isPrime) {
				System.out.println(n + " is prime.");
			} else {
				System.out.println(n + " is not prime.");
			}
		}
	}

}
