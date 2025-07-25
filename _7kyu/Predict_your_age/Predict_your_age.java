package _7kyu.Predic_your_age;

public class Predict_your_age {

	public static void main(String[] args) {
		System.out.println(predictAge(23,78,23,23,54,56,34,45));//65
		System.out.println(predictAge(64,32,63,43,74,86,64,41));//86
		System.out.println(predictAge(53,42,63,83,74,66,84,66));//95
		System.out.println(predictAge(33,52,43,53,44,76,74,85));//84


	}
	public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        
      int [] ages = {age1, age2, age3, age4, age5, age6, age7, age8};// Store all the age parameters in an array for easier processing
      
      int sumAges = 0; // Variable to store the sum of the squares of the ages
      
      // Loop through each age and add the square of the age to the sum
      for(int age : ages){
    	  
        sumAges += age * age;
        
      }
      double sumAge = Math.sqrt(sumAges);// Take the square root of the total sum
      int predicAge = (int) Math.floor(sumAge / 2);// Divide by 2 and round down to the nearest integer
      return predicAge;
    }
}
