package _6kyu.Which_Are_In;

import java.util.ArrayList;
import java.util.Arrays;

public class Which_Are_In {

	public static void main(String[] args) {
	    String[] array1 = {"arp", "live", "strong"};
	    String[] array2 = {"lively", "alive", "harp", "sharp", "armstrong"};
	    
	    System.out.println(Arrays.toString(inArray(array1, array2)));//[arp, live, strong]
	    
	    String[] array3 = {"foo", "bar", "baz"};
	    String[] array4 = {"football", "bartender", "bazooka", "hello"};
	    
	    System.out.println(Arrays.toString(inArray(array3, array4)));//[bar, baz, foo]

	}
	public static String[] inArray(String[] array1, String[] array2) {
		
	        // Create a dynamic list to store matching substrings
		  ArrayList<String> stringList = new ArrayList<>();
		  
      for(String List1 : array1){

          for (String List2 : array2){

        	// If word2 contains word1 and word1 is not already in the list, add it
              if(List2.contains(List1) && !stringList.contains(List1)){
                  stringList.add(List1);
             }
          }
          
      }
      // Convert ArrayList to array and sort it.
              String[] result = stringList.toArray(new String[0]);
              Arrays.sort(result);

      return result;
  }
}
