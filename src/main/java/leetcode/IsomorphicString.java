package leetcode;

import java.util.HashMap;
import java.util.Map;
/**
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
 *
 * Example 1:
 *
 * Input: s = "egg", t = "add"
 * Output: true
 * Example 2:
 *
 * Input: s = "foo", t = "bar"
 * Output: false
 * Example 3:
 *
 * Input: s = "paper", t = "title"
 * Output: true
 *
 * Constraints:
 *
 * 1 <= s.length <= 5 * 104
 * t.length == s.length
 * s and t consist of any valid ascii character.
 */



public class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        int size = s.length();

        Map<Character, Character> pairs = new HashMap<>();
        Map<Character, Character> pairs2 = new HashMap<>();


        for(int i = 0; i < size; i++){
            char left = s.charAt(i);
            char right = t.charAt(i);

            if(pairs.containsKey(left)){

                if(pairs.get(left) != right) return false;
            }else{
                pairs.put(left, right);
            }
        }

        for(int i = 0; i < size; i++){
            char left = t.charAt(i);
            char right = s.charAt(i);

            if(pairs2.containsKey(left)){
                if(pairs2.get(left) != right) return false;
            }else{
                pairs2.put(left, right);
            }
        }
        return true;

    }

}
