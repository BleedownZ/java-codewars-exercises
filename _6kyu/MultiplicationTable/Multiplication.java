package _6kyu.MultiplicationTable;

import java.util.Arrays;

public class Multiplication {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(multiplicationTable(3)));
        System.out.println(Arrays.deepToString(multiplicationTable(4)));
        System.out.println(Arrays.deepToString(multiplicationTable(5)));
        System.out.println(Arrays.deepToString(multiplicationTable(6)));
    }
    public static int [][] multiplicationTable(int n){
        int [][] table = new int[n][n];//Creates a 2D array with n rows and n columns.
        int numberColum = 1;
        //Represents the rows of the table (each corresponding to a multiplier).
        for(int i = 0; i < n; i++) {

            int numberRow = 1;
            //Represents the columns in that row
            for (int j = 0; j < n; j++){
                int numberResult = 0;
                //
                numberResult = numberRow * numberColum;//Multiplies the current row and column numbers.
                table[i] [j] = numberResult;//Stores the result in the array.
                numberRow++;
            }
            numberColum++;
        }
        return table;
    }
}
