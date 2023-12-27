package week2.day2;

public class ReverseString {

	public static void main(String[] args) {
		String companyName= "TestLeaf";
		
		char[] array = companyName.toCharArray();
		char[]reverse= new char[array.length];
		int n =0;
		for(int i=array.length-1;i>=0;i--) {
			reverse[n]=array[i];
			n=n+1;
		}
		String result=new String(reverse);
		System.out.println("The revesed form of "+companyName+" is "+result);
	}

}
