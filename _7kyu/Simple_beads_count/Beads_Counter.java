package _7kyu.Simple_beads_count;

public class Beads_Counter {

	public static void main(String[] args) {
		System.out.println(countRedBeads(1));//0
		System.out.println(countRedBeads(4));//6
		System.out.println(countRedBeads(6));//10
		System.out.println(countRedBeads(9));//16

	}
	public static int countRedBeads(final int nBlue) {
		//Store the numbers read bead.
	      int redBeads= 0;
	      //If the number of blue beads is less than 2, return 0.
	      if(nBlue < 2){
	       return redBeads; 
	      }
	      	//This is because there are always 2 red beads between each pair of blue beads, except after the last one.
	      return redBeads = (nBlue - 1) * 2;
	    }
}
