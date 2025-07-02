package _7ky.Reverse_words;

public static void main(String[] args) {
		System.out.println(reverseWords("The moon "));//ehT noom 
		System.out.println(reverseWords("  Look  the street  "));//  kooL  eht teerts  
		System.out.println(reverseWords("Loops are  very usel"));//spooL era  yrev lesu
		System.out.println(reverseWords("Get this alright"));//teG siht thgirla
	}
	public static String reverseWords(final String original)
	  {
	    // With the method split divide the String in elements that include the white space
	      String[] elementos = original.split("(?<=\\s)|(?=\\s+)");//This are Special constructs (named-capturing)link to see more: https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/util/regex/Pattern.html#sum.

	        StringBuilder resultado = new StringBuilder();//Save to result to return
	        for (String elemento : elementos) {
	          if(!elemento.isEmpty()){
	            StringBuilder palabraInvertida = new StringBuilder(elemento);//Save every reverse word 
	            palabraInvertida.reverse();//Reverse every word
	            resultado.append(palabraInvertida); //add every reverse word
	            }else{
	            resultado.append("");//Keep the white spaces
	          }
	        }

	        return resultado.toString();
	    
	    }
