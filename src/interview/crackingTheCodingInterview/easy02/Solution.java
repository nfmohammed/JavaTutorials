package interview.crackingTheCodingInterview.easy02;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isPermutation("abc", "bca")); //true
        System.out.println(isPermutation("ab1", "b1a")); //true
        System.out.println(isPermutation("abb", "aab")); //false
        System.out.println(isPermutation("a.1", "1.a")); //true
    }

    private static boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        populateCharacterCount(s1, map1);
        populateCharacterCount(s2, map2);
        return compareMaps(map1, map2);

    }
    private static void populateCharacterCount(String s, Map<Character, Integer> m) {
        for(int i=0; i<=s.length()-1; i++) {
            Character c = s.charAt(i);
            if (m.get(c) == null) {
                m.put(c, 1);
            } else {
                m.put(c, m.get(c) + 1);
            }
        }
    }
    private static boolean compareMaps(Map<Character, Integer> m1, Map<Character, Integer> m2) {
        if(m1.size() != m2.size()) {
            return false;
        }
        for(Character c: m1.keySet()) {
            if (m1.get(c) != m2.get(c)) {
                return false;
            }
        }
        return true;
    }
}
