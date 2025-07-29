package _7kyu.Simple_beads_count;

public class Beads_Counter_Ref {

	public static void main(String[] args) {
		System.out.println(countRedBeads(10));//18
		System.out.println(countRedBeads(2));//2
		System.out.println(countRedBeads(23));//44
		System.out.println(countRedBeads(34));//66


	}
	public static int countRedBeads(final int nBlue) {
			/*
			 * If the number of blue beads is less than 2, return 0.
			 * Otherwise, use the formula: (nBlue - 1) * 2,
			 * because there are always 2 red beads between each pair of blue beads, 
			 * except after the last one.
			 * */
	      return nBlue < 2 ? 0 : (nBlue - 1) * 2;
	    }
}
