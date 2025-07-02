package _7kyu.Reverse_words;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Reverse_Words_Ref {

	public static void main(String[] args) {
		System.out.println(reverseWords("general-purpose"));//esoprup-lareneg
		System.out.println(reverseWords(" These APIs "));// esehT sIPA 
		System.out.println(reverseWords("The following  table"));//ehT gniwollof  elbat
		System.out.println(reverseWords("Java compiler"));//avaJ relipmoc

	}
	public static String reverseWords(final String original)
	  {
			/* In the first line, I use the trim() method along with isEmpty() to return the input if it's empty or contains only white spaces.
			   The original string is kept unchanged because we don't assign it to a new variable.
			   The ? is the ternary conditional operator. If the condition is true, it returns the original string; otherwise, it continues with the Stream operations.
			   The Stream API is use for a sequence of elements supporting sequential and parallel aggregate operations.
			*/
		
	        return original.trim().isEmpty() ? original : Stream.of(original.split("(?<=\\s)|(?=\\s+)"))// Split the string by preserving whitespace as separate elements.
	                .map(word -> new StringBuilder(word).reverse())// Reverse each word (including spaces as-is).
	                     .collect(Collectors.joining(""));// Combine all reversed parts into a single string.
	        
	    }
}
