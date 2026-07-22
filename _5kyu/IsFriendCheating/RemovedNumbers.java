package _5kyu.IsFriendCheating;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovedNumbers {
    public static void main(String[] args) {
        List<long[]> result = removNb(26);
            for (long[] arr : result){
                System.out.print(Arrays.toString(arr));
            }
        List<long[]> result2 = removNb(13);
            for (long[] arr2 : result2){
                System.out.print(Arrays.toString(arr2));
            }
        List<long[]> result3 = removNb(16);
            for (long[] arr3 : result3){
                System.out.print(Arrays.toString(arr3));
            }

        List<long[]> result4 = removNb(9);
            for (long[] arr4 : result4){
                System.out.print(Arrays.toString(arr4));
            }
    }
    public static List<long[]> removNb(long n) {
        // variables
        long totalSum = (n*(n+1))/2;//Formula Carl Friedrich Gauss.
        long a = 1;
        long b = 0;
        List<long[]> result = new ArrayList<>();
        //loop
        while (a <= n){
            //Check the b variable
            b =(totalSum - a)/(a + 1);
            // Check if b is lower than n and the check the third point of kata.
            if(b <= n && a * b == totalSum - a - b){
                result.add(new long[]{a,b});
            }else {
                b = a;
            }
            a++;
        }
     return result;
    }
}
