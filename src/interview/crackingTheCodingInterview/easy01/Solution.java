package interview.crackingTheCodingInterview.easy01;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isUnique("abcdefg")); //true
        System.out.println(isUniqueNoDataStructure("abcdefg")); //true
        System.out.println(isUnique("abc123")); //true
        System.out.println(isUniqueNoDataStructure("abc123")); //true
        System.out.println(isUnique("ab-e1f")); //true
        System.out.println(isUniqueNoDataStructure("ab-e1f")); //true
        System.out.println(isUnique("abc1a")); //false
        System.out.println(isUniqueNoDataStructure("abc1a")); //false
        System.out.println(isUnique(" ")); //true
        System.out.println(isUniqueNoDataStructure(" ")); //true
        System.out.println(isUnique("  ")); //false
        System.out.println(isUniqueNoDataStructure("  ")); //false
    }
    private static boolean isUnique(String s) {
        Set<Character> myset = new HashSet<>();
        for (int i=0; i<= s.length()-1; i++) {
            if (myset.contains(s.charAt(i))) {
                return false;
            }
            myset.add(s.charAt(i));
        }
        return true;
    }

    private static boolean isUniqueNoDataStructure(String s) {
        for (int i = 0; i <= s.length() -1; i++) {
            for (int j=0; j <= s.length() -1; j++) {
               Character focus = s.charAt(i);
                if (i != j && focus == s.charAt(j)) {
                       return false;
               }
            }
        }
        return true;
    }
}
