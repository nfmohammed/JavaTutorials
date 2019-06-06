package interview.crackingTheCodingInterview.easy04;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome("aba"));
        System.out.println(isPalindrome("ab a"));
        System.out.println(isPalindrome("abda"));
        System.out.println(isPalindrome("Tact Coa"));
    }
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        List<Character> list = new ArrayList<>();
        for( int i=0; i<= s.length()-1; i++) {
            Character c = s.charAt(i);
            if (c != ' ') {
                if(list.contains(c)) {
                    list.remove(c);
                } else {
                    list.add(c);
                }
                
            };
        }
        return list.size() == 0 || list.size() == 1;
    }
}

