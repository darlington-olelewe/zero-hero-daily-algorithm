package hashMapsSolutions;

import java.util.HashMap;
import java.util.Map;

/**
 * Count the number of Duplicates
 * Write a function that will return the count of distinct case-insensitive alphabetic characters
 * and numeric digits that occur more than once in the input string.
 * The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
 *
 *PLEASE CHECK THE TEST PACKAGE FOR TEST CASES
 */


public class CountingDuplicates {
    public static void main(String[] args) {

        System.out.println(duplicateCount("abcdea"));

    }


    public static int duplicateCount(String text) {
        // Write your code here

        text = text.toUpperCase();
        Map<Character,Integer> keyValue = new HashMap<Character,Integer>();

        for(Character chars: text.toCharArray()){
            keyValue.merge(chars,1,Integer::sum);
        }

        int count = 0;

        for(Map.Entry kv: keyValue.entrySet()){
            Integer current = (Integer) kv.getValue();
            if(current > 1) count++;
        }

        return count;
    }
}
