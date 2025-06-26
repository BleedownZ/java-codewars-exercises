package _7kyu.Vowel_Count;

public class Wowels_Refactoring {

	public static void main(String[] args) {
		System.out.println(getCount("Essential"));//3
		System.out.println(getCount("Challenge"));//3
		System.out.println(getCount("Grammar "));//3
		System.out.println(getCount("Pronouncing"));//4

	}
	 public static int getCount(String str) {
		  	//The method chars return an IntStream of char values from this String
		    return (int) str.chars()
		        .filter(c -> "aeiou".indexOf(c) >= 0)//The method filter return a new stream 
		        .count();//This method count the elements this stream.
		  }
}
