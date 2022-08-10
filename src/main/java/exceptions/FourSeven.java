package exceptions;

import java.util.HashMap;
import java.util.Map;

/**
 * Four Seven
 * Simple kata, simple rules: your function should accept the inputs 4 and 7.
 * If 4 is entered, the function should return 7.
 * If 7 is entered, the function should return 4.
 * Anything else entered as input should return 0.
 * There's only one catch, your function cannot include if statements, switch statements, or the ternary operator.
 */


public class FourSeven {
    public static void main(String[] args) {
        System.out.println(fourSeven(4));
        System.out.println(fourSeven(7));
        System.out.println(fourSeven(9));
    }


    public static int fourSeven(int n){

        Map<Integer,Integer> maps = new HashMap<>();
        maps.put(7,4);
        maps.put(4,7);

        try{
            return maps.get(n);
        }catch (Exception e){

        }

        return 0;

    }
}
