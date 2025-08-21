package _6kyu.Delete_Occurrences_N;

import java.util.ArrayList;
import java.util.Arrays;

public class EnoughIsEnough {

	public static void main(String[] args) {
		
		int[] elements = {1, 2, 3, 1, 2, 1, 4, 2, 5};
		int maxOccurrences = 2;

		System.out.println(Arrays.toString(deleteNth(elements, maxOccurrences)));//[1, 2, 3, 1, 2, 4, 5]
		
		int[] elements1 = {-1, -1, 0, 0, 1, 1, 1, 2, 2};
		int maxOccurrences1 = 1;

		System.out.println(Arrays.toString(deleteNth(elements1, maxOccurrences1)));//[-1, 0, 1, 2]

		int[] elements2 = {5, 5, 6, 7, 7, 7, 8, 9, 9, 9, 9};
		int maxOccurrences2 = 2;

		System.out.println(Arrays.toString(deleteNth(elements2, maxOccurrences2)));//[5, 5, 6, 7, 7, 8, 9, 9]
	}
	public static int[] deleteNth(int[] elements, int maxOccurrences) {
	    
		ArrayList<Integer> interList = new ArrayList<>();// Create a new dynamic ArrayList to store filtered elements

		         // Check how many times the current element (beforeInt) already exists in interList
	        for (int beforeInt : elements) {
	        	
	            int repeatNumber = 0;
	            
	            for (int afterInt : interList) {
	              
	                if (beforeInt == afterInt) {
	                	
	                    repeatNumber++;
	                }
	            }
	            	// Add the element only if it appears fewer times than maxOccurrences
	            if (repeatNumber < maxOccurrences) {
	            	
	                interList.add(beforeInt); 
	            }
	        }
	        
	        // Convert ArrayList<Integer> to int[]
	        int[] intArray = new int[interList.size()];
	        
	        for (int i = 0; i < interList.size(); i++) {
	        	
	            intArray[i] = interList.get(i);  // Unboxing Integer to int
	            
	        }
	        return intArray;
		}

}
