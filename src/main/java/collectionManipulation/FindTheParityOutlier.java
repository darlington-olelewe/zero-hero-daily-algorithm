package collectionManipulation;

import java.util.HashMap;
import java.util.Map;
/**
 * DESCRIPTION:
 * You are given an array (which will have a length of at least 3, but could be very large) containing integers.
 * The array is either entirely comprised of odd integers or entirely comprised of even integers except for a
 * single integer N. Write a method that takes the array as an argument and returns this "outlier" N.
 *
 * [2, 4, 0, 100, 4, 11, 2602, 36]
 * Should return: 11 (the only odd number)
 *
 * [160, 3, 1719, 19, 11, 13, -21]
 * Should return: 160 (the only even number)
 */



public class FindTheParityOutlier {

    public static void main(String[] args) {
        System.out.println(find(new int[]{2, 4, 0, 100, 4, 11, 2602, 36})); //11
        System.out.println(find(new int[]{160, 3, 1719, 19, 11, 13, -21})); //106
    }

    static int find(int[] integers){

        if(determineDataSet(integers)){
            for(int i = 0; i < integers.length; i++){
                if(integers[i] %2 != 0) return integers[i];
            }
        }else{
            for(int i = 0; i < integers.length; i++){
                if(integers[i] %2 == 0) return integers[i];
            }
        }
        return 0;
    }
    static boolean determineDataSet(int[] integers){

        Map<Boolean, Integer> choices = new HashMap<>();
        choices.put((Boolean) true,0);
        choices.put((Boolean) false,0);


        for(int i = 0; i < 3; i++){
            if(integers[i] % 2 == 0){
                choices.merge((Boolean) true,1,Integer::sum);
            }else{
                choices.merge((Boolean) false,1,Integer::sum);
            }
        }

       return choices.get((Boolean)true) > choices.get((Boolean)false) ?
               true : false;
    }
}


