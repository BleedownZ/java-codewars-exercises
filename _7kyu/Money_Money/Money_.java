package _7ky.Money_Money;

public class Money_ {

	public static void main(String[] args) {
		
		System.out.println(calculateYears(1200.00,0.05,0.12,1300.00));//2
		System.out.println(calculateYears(1490.00,0.03,0.15,1600.00));//3
		System.out.println(calculateYears(740.50,0.04,0.14,900.00));//6
		System.out.println(calculateYears(699.89,0.06,0.11,800.00));//3
	}
	public static int calculateYears(double principal, double interest,  double tax, double desired) {
	    
	    int years = 0;
	    //if principal is equal than a desired years is 0
	    if(principal >= desired){
	      return years;
	    }
	    while(desired >= principal  ){
	    	
	    	//Interest Earned(principal* interest)
	    	//Note to Tax: not the invested principal is taxed, but only the year's accrued interest
	      double yearEarned = principal * interest;
	      double netGain = yearEarned - (yearEarned * tax);//Net Gain(Interest Earned - (Interest Earned * tax))
	      principal = principal + netGain;
	      years++;
	   }
	    return years;
    }
}
