package _5kyu.Josephus_Survivor;

public class JosephusSurvivor {
    public static void main(String[] args) {
        System.out.println(josephusSurvivor(16,3));
        System.out.println(josephusSurvivor(23,4));
        System.out.println(josephusSurvivor(34,6));
    }
    public static int josephusSurvivor(final int n, final int k) {

        int [] list = new int[n];

        for (int i = 0; i < n; i++){

            list [i] = i + 1 ;
        }
        int index = 0;
        int count = n;

        while (count > 1) { // Repeat until only one person remains

            index = (index + k - 1) % count;

            // Shift elements to remove the selected person
            for (int j = index; j < count - 1; j++) {
                list[j] = list[j + 1];
            }
            count--;
        }

        return list[0];
    }
}
