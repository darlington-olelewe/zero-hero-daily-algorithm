package stringManipulation;

import java.util.Arrays;

/**
 *#Find the missing letter
 *
 * Write a method that takes an array of consecutive (increasing) letters as input and that returns the missing letter in the array.
 *
 * You will always get an valid array. And it will be always exactly one letter be missing. The length of the array will always be at least 2.
 * The array will always contain letters in only one case.
 *
 * Example:
 *
 * ['a','b','c','d','f'] -> 'e' ['O','Q','R','S'] -> 'P'
 *
 * ["a","b","c","d","f"] -> "e"
 * ["O","Q","R","S"] -> "P"
 *
 *
 * (Use the English alphabet with 26 letters!)
 *
 * Have fun coding it and please don't forget to vote and rank this kata! :-)
 *
 * I have also created other katas. Take a look if you enjoyed this kata!
 */


public class FindTheMissingLetter {

    public static void main(String[] args) {
        char[] letters = new char[]{'a','b','c','d','f'};
        char[] letters2 = new char[]{'O','Q','R','S'};


        System.out.println(findMissingLetter(letters));
        System.out.println(findMissingLetter2(letters));
        System.out.println(findMissingLetter(letters2));
        System.out.println(findMissingLetter2(letters2));
    }

    public static char findMissingLetter(char[] array) {
        Arrays.sort(array);
        int current = array[0];
        int found = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            System.out.println(String.format("this is current %d , this is arr %d",current,(int)array[i]));
            if (current != array[i]) {
                found = current;
                break;
            }
            current += 1;
        }
        return (char)found;
    }


    public static char findMissingLetter2(char[] array) {
        String alpha = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
       String subString = alpha.substring(alpha.indexOf(array[0]), alpha.indexOf(array[array.length-1])+1);
       char missingLetter = ' ';
       for(int i = 0; i < subString.length(); i++){
           if(subString.charAt(i) != array[i]){
               missingLetter = subString.charAt(i);
               break;
           }
       }
        return missingLetter;
    }

}
