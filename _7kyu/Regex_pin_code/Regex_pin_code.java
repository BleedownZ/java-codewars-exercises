package _7kyu.Regex_pin_code;

public class Regex_pin_code {
	
	public static void main (String [] arg) {
		System.out.println(validatePin("2343"));//true
		System.out.println(validatePin("43438"));//false
		System.out.println(validatePin("234387"));//true
		System.out.println(validatePin("322s"));//false
	}
	
	 public static boolean validatePin(String pin) {
		    // Your code here...
		    /*
		     PIN codes 4 or 6 digit.
		     return true or false.
		     allowed only digits.
		    */
		    //Condition 4 or 6 digit
		    if(pin.length() == 4 || pin.length() == 6){
		      //Used charAt an isDigit method
		        for(int i = 0; i < pin.length(); i++){

		          if(!Character.isDigit(pin.charAt(i))){
		            return false;
		          }
		        }       
		     return true;   
		    }else{
		      
		     
		    return false;
		    }
		    
		  }

}
