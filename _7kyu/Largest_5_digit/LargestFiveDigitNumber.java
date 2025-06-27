package _7kyu.Largest_5_digit;

public class LargestFiveDigitNumber {

	public static void main(String[] args) {
		
		final String card1 = "2348923498";
		final String card2 = "8493274393";
		final String card3 = "7134828148";
		
		System.out.println(solve(card1));//92349
		System.out.println(solve(card2));//93274
		System.out.println(solve(card3));//82814
	}
	 public static int solve(final String digits) {
         // you code here
      /*Should return a five digit integer.
      * The number passed maybe as large as 1000 digits.
        I have to convert string a integer to returned.
        I should to compare five digit integer with other five.
        I have to store a the greatest in variable.
        I will to try with double loop for.//I try but it was very slowly.
      */
        //Condition as large as 1000 digits.
        if( digits.length() <= 1000 && digits.length() > 5){
          //number stored
            int numberGreat =Integer.parseInt(digits.substring(0,5));
            //first loop for a number1
          for(int i=0; i <= digits.length()-5; i++){  
            int secondNumber = Integer.parseInt(digits.substring(i,i + 5));
            //To Compare the number great and the next number
               if(secondNumber > numberGreat){
                 numberGreat = secondNumber;
              }
             }
          return numberGreat;           
          }else{
          System.out.println("The number is out range");
          return -1;//This display a issue(convention in languages how java).
        }
     
    }
}
