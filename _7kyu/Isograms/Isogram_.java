package _7kyu.Isograms;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Isogram_ {

	public static void main(String[] args) {
		System.out.println(isIsogram("background"));//true
		System.out.println(isIsogram("programming"));//false
		System.out.println(isIsogram("hydropneumatic"));//true
		System.out.println(isIsogram("punctuation"));//false

	}
	public static boolean  isIsogram(String str) {
	      
		    // Define the regex pattern to match any letter once, ignoring case
	        str = str.toLowerCase();
	        //link the class patter: Java version 19(https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/util/regex/Pattern.html) 
	        /*The ^ is for the patter begin of a line.
	         *The (?=.*[a-zA-Z]),positive lookahead: Checks (but doesn't consume) that the string contains at least one letter.
	         *The (?!.*(.).*\\1), negative lookahead: Prevents duplicate characters.
	         *The [a-zA-Z]+, Character class with quantifier:Matches one or more letters (only A-Z or a-z),o digits, symbols, or whitespace.
	         *The $ end anchor: Ensures the match ends at the end of the string.
	         *This pattern could be shorter, I found it when I was a beginner :D. 
	        */
	        String regex2 = "^(?=.*[a-zA-Z])(?!.*(.).*\\1)[a-zA-Z]+$";

	        // Compile the pattern with the case-insensitive flag
	        Pattern pattern = Pattern.compile(regex2);

	        // Create a matcher to find matches in the input
	        Matcher matcher = pattern.matcher(str);
	        boolean isogram = false;
	        // Find and print matches
	        while (matcher.find()) {
	             isogram = true;
	        }
	       if(str.isEmpty()){
	            isogram = true;
	        }
	        return isogram;
	    
	    } 
}
