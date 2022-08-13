package collectionManipulation;

import java.util.Arrays;
import java.util.Stack;

public class TakeATenMinutesWalk {

    public static void main(String[] args) {
        System.out.println(isValid(new char[]{'n','s','n','s','n','s','n','s','n','s'}));
    }

    public static boolean isValid(char[] walk) {
        // Insert brilliant code here
        int nSum=0, sSum=0, eSum=0, wSum=0;
        for (char c : walk) {
            if (c == 'n') nSum += 1;
            if (c == 's') sSum += 1;
            if (c == 'e') eSum += 1;
            if (c == 'w') wSum += 1;
        }
        if (walk.length == 10)
            if (nSum == sSum && eSum == wSum) return true;
            else return false;
        else return false;
    }
}


