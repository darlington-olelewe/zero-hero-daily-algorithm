package stringManipulation;

import java.util.Arrays;

/**
 * Complete the solution so that it splits the string into pairs of two characters.
 * If the string contains an odd number of characters then it should replace the missing second
 * character of the final pair with an underscore ('_').
 *
 * Examples:
 *
 * * 'abc' =>  ['ab', 'c_']
 * * 'abcdef' => ['ab', 'cd', 'ef']
 */


public class SplitStrings {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("abc")));
    }
    public static String[] solution(String s) {
        //Write your code here
        s = s.length() % 2 == 0 ? s : s+"_";

        String[] sArr = new String[s.length()/2];

        for(int i = 0; i < sArr.length; i++){
            String word = s.substring(0,2);
            s = s.substring(2);

            sArr[i] = word;
        }

        return sArr;
    }
}
