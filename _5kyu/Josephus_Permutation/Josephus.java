package _5kyu.Josephus_Permutation;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Josephus {

    public static void main(String[] args) {
        ArrayList<Integer> group1 = new ArrayList<>(
                Arrays.asList(3, 5, 8, 10, 11, 12, 13)
        );
        ArrayList<Integer> group2 = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 11, 14, 15, 17, 20)
        );
        ArrayList<Integer> group3 = new ArrayList<>(
                Arrays.asList(3, 5, 6, 14, 15, 16, 19, 22, 24, 25)
        );
        System.out.println(josephusPermutation(group1, 3));
        System.out.println(josephusPermutation(group2, 4));
        System.out.println(josephusPermutation(group3, 2));

    }
    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
        /*
         *   Create a function the returns a Josephus
         *       initial array/list (items)(final value)
         *       counted out every k
         *   - Create an arrays list for save the value items
         *   - Create a new arrays for save the final result
         *   - Use a loop for access the values and to order the values in the new array list;
         *   - Return the new array.
         * */
        List <T> result = new ArrayList<>();
        List <T> copy = new ArrayList<>(items);
        int index = 0;
        while (!copy.isEmpty()){
            index = (index + k -1) % copy.size();
            result.add(copy.remove(index));
        }
        return result;
    }
}
