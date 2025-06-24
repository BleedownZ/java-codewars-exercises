package _7ky.Form_the_minium;
import java.util.Arrays;
import java.util.HashSet;


public class Minium {

	public static void main(String[] args) {
		//Creation and initialization of variables
		//There several issues.
		int[] numbers1 = new int[]{2, 3, 4, 7, 5};
		int[] numbers2 = new int[]{5, 1, 3, 6, 5};
		int[] numbers3 = new int[]{1, 5, 4, 4, 5};
		System.out.println(minValue(numbers1));
		System.out.println(minValue(numbers2));
		System.out.println(minValue(numbers3));
	}
	
	public static int minValue(int[] values){
		    Arrays.sort(values);//Array into ascending numerical order
	        HashSet <Integer> list = new HashSet<Integer>();//A collection that contains no duplicate elements.
	        String minValue = ""; 
	                for (int digit : values) {
	                    list.add(digit);//add each number
	                }
	               for (int number : list) {
	                minValue = minValue + String.valueOf(number);//add the number already String.
	               }
	    
	          return Integer.valueOf(minValue);//I should to return a number.
		}

}
