package stringManipulation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ScrabbleScore {

    /**
     *Write a program that, given a word, computes the scrabble score for that word.
     *
     * Letter Values
     * You'll need these:
     *
     * Letter                           Value
     * A, E, I, O, U, L, N, R, S, T       1
     * D, G                               2
     * B, C, M, P                         3
     * F, H, V, W, Y                      4
     * K                                  5
     * J, X                               8
     * Q, Z                               10
     *
     * Examples
     * "cabbage" --> 14
     * "cabbage" should be scored as worth 14 points:
     *
     * 3 points for C
     * 1 point for A, twice
     * 3 points for B, twice
     * 2 points for G
     * 1 point for E
     * And to total:
     *
     * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 14
     *
     * Empty string should return 0. The string can contain spaces and letters (upper and lower case), you should calculate the scrabble score only of the letters in that string.
     *
     * ""           --> 0
     * "STREET"    --> 6
     * "st re et"    --> 6
     * "ca bba g  e" --> 14
     */

    public static void main(String[] args) {
    String word = "cabbage";
    String word2 = "QmZuqUljbcsoL";
        System.out.println(scrabbleScore(word));
        System.out.println(scrabbleScores(word));
        System.out.println(scrabbleScore(word2));
        System.out.println(scrabbleScores(word2));

    }

    public static int scrabbleScore(String word) {
        //solution

        char[] wordChar = word.toUpperCase().toCharArray();

        int wordScore  = 0;
        for(int i = 0; i < wordChar.length; i++){
            wordScore += charScore(wordChar[i]);
        }
        return wordScore;
    }

    public static int charScore(char letter){
        if(letter == ' ') {
            return 0;
        }if(letter == 'D' || letter == 'G'){
            return 2;
        }if(letter == 'B' || letter == 'C' || letter == 'M' || letter == 'P'){
            return 3;
        }if(letter == 'F' || letter == 'H' || letter == 'V' || letter == 'W' || letter == 'Y'){
            return 4;
        }if(letter == 'K'){
            return 5;
        }if(letter == 'J' || letter == 'X'){
            return 8;
        }if(letter == 'Q' || letter == 'Z'){
            return 10;
        }return 1;

    }



    public static int scrabbleScores(String word){
        if(word.isEmpty() || word.isBlank()) return 0;

        String[] words = word.toUpperCase().split("");
        Map<Character,Integer> p = new HashMap<>();
        p.put('A',1); p.put(' ',0);p.put('D',2); p.put('G',2);p.put('B',3); p.put('C',3);p.put('M',3);p.put('P',3);p.put('Q',10);
        p.put('F',4); p.put('H',4);p.put('V',4); p.put('W',4);p.put('Y',4); p.put('K',5);p.put('J',8);p.put('X',8);p.put('Z',10);

        return Arrays.stream(words).map(e->p.getOrDefault(e.toCharArray()[0],1)).reduce(Integer::sum).orElse(0);
    }





}
