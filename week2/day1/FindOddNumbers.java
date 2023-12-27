package week2.day1;

public class FindOddNumbers {

	public static void main(String[] args) {
		FindOddNumbers odd = new FindOddNumbers();
		odd.findOdd(10);

		}

	
	public void findOdd(int range) {
		System.out.println("Odd numbers from 1 to " +range);
		for(int i=1;i<=range;i++) {			
			if(i%2==1) {
				System.out.println(i);
			}
	}

	}
}



