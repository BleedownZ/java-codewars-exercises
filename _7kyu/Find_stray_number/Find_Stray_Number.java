package _7kyu.Find_stray_number;
import java.util.Arrays;
public class Find_Stray_Number_Ref {

	public static void main(String[] args) {
		int[] numbers1 = {100, 100, 200, 100};
		int[] numbers2 = {42, 42, 42, 42, 42, 17, 42, 42, 42};
		int[] numbers3 = {-1, -1, -1, -5, -1};
		int[] numbers4 = {6, 1, 6, 6, 6, 6};
		
		System.out.println(stray(numbers1));//200
		System.out.println(stray(numbers2));//17
		System.out.println(stray(numbers3));//-5
		System.out.println(stray(numbers4));//1
	}
	 static int stray(int[] numbers) {
		 
		 		//The arrays are valid 
		    if(numbers.length >= 3){
		    	//This sorts the array in ascending order.
		    	Arrays.sort(numbers);
			    /*This is a ternary operator
			     * If the first number is different from the second, then the stray number is the first one.
			     * Otherwise, the stray number must be at the end (last index), because all the rest are the same.
			     */

		    	return numbers[0] != numbers[1] ? numbers[0] : numbers[numbers.length - 1];
		    
		    }else{
		      System.out.println("The input no be valid");
		    }
		    return -1;
		  }
}
