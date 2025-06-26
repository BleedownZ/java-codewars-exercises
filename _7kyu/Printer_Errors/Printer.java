package _7kyu.Printer_Errors;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Printer {

	public static void main(String[] args) {
		System.out.println(printerError("jsldfjslds8"));// "4/11" 
		System.out.println(printerError("jslfjoeiw83"));// "5/11"
		System.out.println(printerError("feoifjncoelsjlsaakjmm"));// "5/21"
		System.out.println(printerError("@#sljdfssjlo3"));// "7/13"

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
