package _7kyu.Two_to_One;

import java.util.Arrays;

public class Two_To_One {

	public static void main(String[] args) {
		System.out.println(longest("sdfoeosedsdf", "oeuplsr"));//defloprsu
		System.out.println(longest("aoilbx", "sdlworxwd"));//abdilorswx
		System.out.println(longest("eoxufpsel", "seridkdkd"));//defikloprsux
		System.out.println(longest("proudoweld", "slerouxpaexc"));//acdeloprsuwx
	}
	 public static String longest (String s1, String s2) {
	       
	     String combined = s1 + s2;
	     boolean[] seen = new boolean[256]; // Array to track seen characters
	     char[] result = new char[combined.length()];
	     int index = 0;

       for (int i = 0; i < combined.length(); i++) {
           char currentChar = combined.charAt(i);
           if (!seen[currentChar]) { // If the character hasn't been seen yet
               seen[currentChar] = true; // Mark it as seen
               result[index++] = currentChar; // Add it to the result array
           }
       }
	     String resultGood = new String(result, 0, index); // Convert char array to string

	     char[] sortedResult = resultGood.replaceAll("[^a-zA-Z]", "").toCharArray();
	     Arrays.sort(sortedResult);
	     return new String(sortedResult);
	 }
}
