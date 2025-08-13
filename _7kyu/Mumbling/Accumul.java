package _7kyu.Mumbling;

public class Accumul {

	public static void main(String[] args) {
		System.out.println(accum("KaskuP"));//K-Aa-Sss-Kkkk-Uuuuu-Pppppp
		System.out.println(accum("SsfdD"));//S-Ss-Fff-Dddd-Ddddd
		System.out.println(accum("aKwbwc"));//A-Kk-Www-Bbbb-Wwwww-Cccccc
		System.out.println(accum("aLdMSEsdd"));//A-Ll-Ddd-Mmmm-Sssss-Eeeeee-Sssssss-Dddddddd-Ddddddddd

	}
	public static String accum(String s) {
        
        //Every letter is returned in duplicate for number order
        String duplicate = "";
        for (int i = 0; i < s.length(); i++) {
            char save = s.charAt(i);
            //concatenation the first in UpperCase
            duplicate += String.valueOf(Character.toUpperCase(save));
            for (int j = 0; j < i; j++) {
                //concatenation the first in LowerCase
                duplicate += String.valueOf(Character.toLowerCase(save));
            }
            if (i < s.length() - 1){
                duplicate += "-";//Every duplicate is separate with "-"
            }
        }
        return duplicate;
    }
}
