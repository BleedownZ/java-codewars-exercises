package _7kyu.Printer_Errors;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Printer {

	public static void main(String[] args) {
		

	}
	 public static String printerError(String s) {
	        //Save String length and error 
	      int tamaño = s.length();
	      int usor=0;
	      //Create pattern for use
	      Pattern pattern = Pattern.compile("[a-m]");
	      Matcher matcher = pattern.matcher(s);
	      //Search errors 
	      for(int i= 0; i < s.length();i++){
	          if(!matcher.find() ){
	            
	            usor++;  
	          }
	      }
	      //Save the result
	      String resultado = String.valueOf(usor +"/"+ tamaño);
	      return resultado;
	    }

}
