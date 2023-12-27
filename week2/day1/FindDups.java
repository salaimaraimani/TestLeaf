package week2.day1;
import java.util.Arrays;

public class FindDups {

	public void findDups(int[] array) {
		Arrays.sort(array);
		for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                System.out.println("Duplicate: " + array[i]);
            }
        }
	}

}
