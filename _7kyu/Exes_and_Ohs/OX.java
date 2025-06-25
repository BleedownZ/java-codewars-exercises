package _7kyu.Exes_and_Ohs;

public class OX {

	public static void main(String[] args) {
		System.out.println(getXO("sfdxxoofjleo"));
		System.out.println(getXO("2adxxoofjlxeo"));
		System.out.println(getXO("fdslfdjsoerjj3238xxo"));
		System.out.println(getXO("sfdffjles"));
		

	}
	 public static boolean getXO (String str) {
		    //Convert to lower case and a array of char. 
		    char list[] = str.toLowerCase().toCharArray();
		    	//Variables to store the number of x and o.
		        int countO = 0;
		        int countX = 0;

		        for (int i = 0; i < list.length; i++) {
		        	//Compare to each char for to know if is x or o .
		            if (list[i] == 'x') {
		                countO++;
		            } else if (list[i] == 'o') {
		                countX++;
		            }
		        }
		        	
		        boolean pairs = (countX == countO || (countX == 0 && countO == 0));//Return true if the number of x and o is pair or if is 0.

		        return pairs;
		    
		 }
}
