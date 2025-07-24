package _7kyu.Remove_Duplicade_Words;
import java.util.stream.Collectors;
import java.util.LinkedHashSet;
import java.util.stream.Stream;

public class Duplicate_words_Ref {

	public static void main(String[] args) {
		System.out.println(removeDuplicateWords("one two two three one one four"));//one two three four
		System.out.println(removeDuplicateWords("hello hello world world test test test"));//hello world test
		System.out.println(removeDuplicateWords("run walk walk jump run run run"));//run walk jump
		System.out.println(removeDuplicateWords("apple apple banana banana orange orange orange"));//apple banana orange

	  	  }
	public static String removeDuplicateWords(String s){
		/* In the first line, I use the trim() method along with isEmpty() to return the input if it's empty or contains only white spaces.
		   The original string is kept unchanged because we don't assign it to a new variable.
		   The ? is the ternary conditional operator. If the condition is true, it continues with the Stream operations, otherwise, it returns the original string.
		   The Stream API is use for a sequence of elements supporting sequential and parallel aggregate operations.
		*/
      
       return !s.trim().isEmpty() ? String.join(" ", //Join the words with a space and return the result.
    		   Stream.of(s.split("\\s+"))//Split the string by one or more spaces. 
               .collect(Collectors.toCollection(LinkedHashSet::new))//Collect the stream into a LinkedHashSet to remove duplicates and preserve order
               ) : s;// If the string is empty after trimming, return it as is.
		    }
       																	
  }															
