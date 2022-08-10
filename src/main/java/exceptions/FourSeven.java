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

    public static int fourSeven2(int n){
        // Your Code Here
        while(n == 4){
            return 7;
        }
        while(n == 7){
            return 4;
        }
        return 0;
    }


    public static int fourSeven3(int n){
        // Your Code Here
        Map<Integer,Integer> maps = new HashMap<>();
        maps.put(7,4);
        maps.put(4,7);
        return maps.getOrDefault(n,0);
    }
}
