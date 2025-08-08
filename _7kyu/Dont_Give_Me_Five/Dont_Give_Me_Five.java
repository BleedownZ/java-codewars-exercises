package _7kyu.Dont_Give_Me_Five;

public class Dont_Give_Me_Five {

	public static void main(String[] args) {
		System.out.println(dontGiveMeFive(13,33));//19
		System.out.println(dontGiveMeFive(4,21));//16
		System.out.println(dontGiveMeFive(8,11));//4
		System.out.println(dontGiveMeFive(122,343));//182
	}
	public static int dontGiveMeFive(int start, int end) {
		
	        int count = 0;
	        
	     // the numbers start always be smaller than end number
	        if (start < end){
	        	
	        	//We go through all the numbers from 'start' to 'end' (inclusive)
	          for (int i = start; i <= end; i++) {
	        	  
	        	         //If the number doesn't contain the digit 5, we count it
	                    if (!containsFive(i)) {
	                        count++;
	                    }
	                }
	          
	        }else {
	            System.out.println("Numbers are no correct");
	        }

	        return count;
	}
	private static boolean containsFive(int number) {
	        number = Math.abs(number); // Ensure the number is positive for checking digits
	        
	        while (number > 0) {
	        	
	        	//We check if the last digit is a 5
	            if (number % 10 == 5) {
	            	
	                return true;
	            }
	            number /= 10;//We remove the last digit and continue
	        }
	        return false;
    }
}
