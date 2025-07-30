package _7kyu.Money_Money;

import java.util.stream.Stream;

public class Money_Ref {

	public static void main(String[] args) {
		System.out.println(calculateYears(1200.00,0.05,0.12,1300.00));//
		System.out.println(calculateYears(1200.00,0.05,0.12,1300.00));//
		System.out.println(calculateYears(1200.00,0.05,0.12,1300.00));//
		System.out.println(calculateYears(1200.00,0.05,0.12,1300.00));//
		

	}
	 public static int calculateYears(double principal, double interest,  double tax, double desired) {
		    //Interest Earned(principal* interest)
		    //Note to Tax: not the invested principal is taxed, but only the year's accrued interest
		    //Net Gain(Interest Earned - (Interest Earned * tax))
		    
		 		//if principal is equal than a desired years is 0
		    if (principal >= desired) {
		            return 0;
		    }
								 // Returns a sequential, ordered Stream that simulates the annual growth of the principal.
								 // Each element in the stream is a double array: [currentPrincipal, yearsPassed].
		        return (int) Stream.iterate(
		        		new double[]{principal, 0},//Initial state: principal and year counter
		        		state -> state[0] < desired,// Condition: continue while principal < desired
		                        state -> new double[]{ //Next estate:
		                        	state[0] + state[0] * interest * (1 - tax),// Update principal with net interest
		                        	state[1] + 1  // Increment yearsPassed
		                        	}
		                        ).count();// Count how many iterations (years) it takes to reach the desired amount


	}
}
