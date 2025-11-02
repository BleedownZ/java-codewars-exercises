package _6kyu.BreakcamelCase;

public class BreakCamelCase {
    public static void main(String[] args) {
        System.out.println(camelCase("movistarKoi"));
        System.out.println(camelCase("MadeinJapan"));
        System.out.println(camelCase("libertyCity"));
        System.out.println(camelCase("bullCarTwo"));

    }
    public static String camelCase(String input) {
     /*
    /- The method receive a string how input.
     - When the string have an upper case this is break with one space.
     -If the string is void it should to return the same.
     */
        StringBuilder sb = new StringBuilder();
        //If the string is void.
        if (sb.capacity() == 0) {
            return "";
        }
        for (char letter : input.toCharArray()) {
            sb.append(letter);
            //Codi ASCII
            if ((int) letter < 90) {
                sb.insert(sb.length() - 1, " ");
            }
        }
        return sb.toString();
    }
}
