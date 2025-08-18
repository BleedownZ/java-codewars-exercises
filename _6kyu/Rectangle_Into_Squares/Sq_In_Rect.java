package _6kyu.

import java.util.List;
import java.util.ArrayList;

public class Sq_In_Rect {

	public static void main(String[] args) {
        System.out.println(sqInRect(12, 4));//[4, 4, 4]
        System.out.println(sqInRect(32, 5));//[5, 5, 5, 5, 5, 5, 2, 2, 1, 1]
        System.out.println(sqInRect(23, 9));//[9, 9, 5, 4, 1, 1, 1, 1]
        System.out.println(sqInRect(13, 6));//[6, 6, 1, 1, 1, 1, 1, 1]

	}
	public static List<Integer> sqInRect(int lng, int wdth) {
		
		/* Search the great common divisor
        * calculation the great cube for cutting.
        * calculation the others cube
        *  */
		
        List<Integer> cubes = new ArrayList<>();
        
        if(lng > 0 & wdth > 0 ) {
        	
            //Search the great common divisor
            int greaterNumber;
            if (lng > wdth) {
                greaterNumber = lng;
            } else {
                greaterNumber = wdth;
            }
            
            int greatComDiv = 0;
            
          // Check the great number
            for (int i = 1; i < greaterNumber; i++){
            	
                greatComDiv = 1;

                boolean greatCD = lng % i == 0 || wdth % i == 0;
                
                if(greatCD) {
                    greatComDiv = greatComDiv * i;
                }
            }
            
            //If the longitude and width are same
            if (lng == wdth) {
                return null;
            }
            
            //calculation the great cube for cutting.
                int save1;
                int save2;
                save1 = lng;
                save2 = wdth;
                while(save1 >= greatComDiv && save2 >= greatComDiv){

                    if (save1 < save2){
                        cubes.add(save1);
                        save2 = save2 - save1;
                    }else {
                        cubes.add(save2);
                        save1 = save1 - save2;
                    }
                }

        }else{
            System.out.println("The number is negative or not valid");
        }
        return cubes;
	}
}
