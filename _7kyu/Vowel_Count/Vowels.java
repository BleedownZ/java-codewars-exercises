package _7kyu.Vowel_Count;

public class Vowels {

	public static void main(String[] args) {
		System.out.println(getCount("preparing"));//3
		System.out.println(getCount("Business"));//3
		System.out.println(getCount("dictionaries"));//6
		System.out.println(getCount("Manufacturers"));//5
	}
	 public static int getCount(String str) {		    
     // variable that get number vowels   
		    int vCont = 0;
     
		      //loop for count the vowels.    
		    for(int i = 0; i < str.length(); i++) {
		      if (str.charAt(i) == 'a' || str.charAt (i) == 'i' || str.charAt (i) == 'u' || str.charAt (i) == 'e' || str.charAt (i) == 'o')
		         vCont++;
		      }
		    return vCont;
		  }
}
