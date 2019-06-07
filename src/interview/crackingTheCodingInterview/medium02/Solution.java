package interview.crackingTheCodingInterview.medium02;

import java.util.List;
import java.util.ArrayList;
import java.lang.Character;

public class Solution {
    public static void main(String[] args) {

        System.out.println(isOneEditAway("abc", "def")); //false
        System.out.println(isOneEditAway("abc", "abc")); //true
        System.out.println(isOneEditAway("abd", "abe")); //true
        System.out.println(isOneEditAway("abcd", "abc")); //true
        System.out.println(isOneEditAway("prts", "srtp")); //true
    }
    private static boolean isOneEditAway(String s1, String s2) {
       String left, right;
       if (Math.abs(s1.length() - s2.length()) > 1) {
           return false;
       }
        if (s1.length() >= s2.length()) {
            left =s1;
            right = s2;
        } else {
            left = s2;
            right = s1;
        }
        boolean condition = true;
        int index = 0;
        while(condition) {
            if (right.length() == 0) {
                condition = false;
            } else {
                String c = String.valueOf(right.charAt(index));
                if (left.contains(c)) {
                   left = left.replaceFirst(c,"");
                   right = right.replaceFirst(c, "");
                } else {
                    if (index < right.length()-1) {
                        index++;
                    } else {
                        condition = false;
                    }
                }
            }
        }
        if(right.length() == 0) {
            return true;
        }
        if(right.length() == 1 && left.length() == 1) {
            return true;
        }
        return false;
    }
}
