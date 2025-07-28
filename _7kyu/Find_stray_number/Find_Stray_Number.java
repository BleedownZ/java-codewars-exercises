package _7kyu.Find_stray_number;
import java.util.Arrays;

public class Find_Stray_Number {

	public static void main(String[] args) {
		int[] numbers1 = {17, 99, 99, 99, 99};
		int[] numbers2 = {7, 7, 7, 5, 7};
		int[] numbers3 = {99, 3, 3, 3, 3};
		int[] numbers4 = {0, 0, 0, 4, 0};
	 System.out.println(stray(numbers1));//17
	 System.out.println(stray(numbers2));//5
	 System.out.println(stray(numbers3));//99
	 System.out.println(stray(numbers4));//4

	}
	static int stray(int[] numbers) {
	    //This sorts the array in ascending order.
	    Arrays.sort(numbers);
	    /*This is a ternary operator
	     * If the first number is different from the second, then the stray number is the first one.
	     * Otherwise, the stray number must be at the end (last index), because all the rest are the same.
	     */
	    return numbers[0] != numbers[1] ? numbers[0] : numbers[numbers.length - 1];
	  }
}
