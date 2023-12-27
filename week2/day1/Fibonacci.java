package week2.day1;

public class Fibonacci {
	public static void main(String[] args) {
		Fibonacci print = new Fibonacci();
		print.fib(8);
	}
	public void fib(int n) {
		
		if (n <= 1) {
			System.out.println("please enter a number greater than one!");
		}
		else {
			System.out.println("The Fibonacci series for "+n+" is");
			int first=0;
			int second=1;
			for(int i=2;i<n;i++) {
				int temp= first+second;
				
				System.out.println(temp);
				first = second;
				second = temp;
			}
		}
	}

}

