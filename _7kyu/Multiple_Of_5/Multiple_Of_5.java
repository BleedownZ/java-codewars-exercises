package _7kyu.Multiple_Of_5;

public class Multiple_Of_5 {

	public static void main(String[] args) {
		System.out.println(roundToNext5(34));//35
		System.out.println(roundToNext5(52));//55
		System.out.println(roundToNext5(-32));//-30
		System.out.println(roundToNext5(-6));//-5

	}
	public static int roundToNext5(int number) {
	    if(number % 5 == 0){
	        return number;	//check if the number is a multiple of 5.
	    }
	    int roundNumber = (number/5); // Divide by 5 to find the closest lower multiple
	    	//Check if the number is positive.
	      if(number > 0){
	            roundNumber = roundNumber + 1; // Round up to the next multiple of 5 if positive
	        }else if(number < 0){
	        roundNumber = roundNumber - 0;
	      }
	        roundNumber = roundNumber * 5; // Multiply to get the next multiple of 5
	    return roundNumber;
	  }
}
