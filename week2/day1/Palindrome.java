package week2.day1;

public class Palindrome {
	public static void main(String[] args) {
		Palindrome check = new Palindrome();
		check.findPalindrome(420);
	}
	public void findPalindrome(Integer num) {
		int reverse=0;
		for (int n=num;n>0;n/=10) {
			int reminder=num%10;
			reverse=(reverse*10)+reminder;			
		}
		if(num==reverse) {
			System.out.println("The given number is palindrome");
		}
		else {
			System.out.println("The given number is not palindrome");
		}
		
	}

}
