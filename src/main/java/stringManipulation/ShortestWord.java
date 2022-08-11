package stringManipulation;

import java.util.Arrays;

public class ShortestWord {

    /**
     * Simple, given a string of words, return the length of the shortest word(s).
     *
     * String will never be empty and you do not need to account for different data types.
     *
     */
    public static void main(String[] args) {
    String s = "bitcoin take over the world maybe who knows perhaps";
        System.out.println(findShort(s));

        System.out.println(findShort2(s));
    }
    public static int findShort(String s) {

        int shortest = Integer.MAX_VALUE;
        String[] strArr = s.split(" ");
        for(String word: strArr) {
            shortest = Math.min(shortest,word.length());
        }
        return shortest;
    }


    public static int findShort2(String s){
        return Arrays.stream(s.split(" ")).reduce((a,b)-> a.length() < b.length() ? a : b).orElse("").length();

    }


}
