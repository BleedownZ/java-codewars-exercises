package _7kyu.Remove_Duplicade_Words;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Duplicate_words {

	public static void main(String[] args) {
		System.out.println(removeDuplicateWords("cat dog dog mouse cat cat rabbit"));//cat dog mouse rabbit
		System.out.println(removeDuplicateWords("sun sun moon moon moon star"));//sun moon star
		System.out.println(removeDuplicateWords("blue red red green green blue blue yellow"));//blue red green yellow
		System.out.println(removeDuplicateWords("up up down down left right right left"));//apple banana orange
	}
	public static String removeDuplicateWords(String s){
        //Save the String in an Array through a pattern. 
       String [] listword = s.split("\\s+");
    // I use LinkedHashSet because it combines the uniqueness of HashSet (no duplicates) with the insertion order of LinkedList.
     LinkedHashSet <String> set = new LinkedHashSet<String>(Arrays.asList(listword));//The method asList() converts an array to a fixed-size list.
      
        StringBuilder copyword = new StringBuilder();
      
        for (String string : set) {
            copyword.append(string).append(" ");//Add a white space between words."
        }
        String wordnice = copyword.toString();//The method returns a String.
      
          wordnice = wordnice.strip();//Returns a string whose value is this string, with all leading and trailing white space removed. 

        return wordnice;
    }
}
