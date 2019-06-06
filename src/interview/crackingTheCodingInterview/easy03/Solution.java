package interview.crackingTheCodingInterview.easy03;

public class Solution {
    public static void main(String[] args) {
        String s1 = "Mr John Smith ";
        System.out.println(uglify(s1)); // Mr%20John%20Smith

    }
    private static String uglify(String s) {
        String[] ts = s.trim().split(" ");
        String output=ts[0];
        for(int i=1; i <= ts.length-1; i++) {
            output = output+ "%20" + ts[i];
        }
        return output;
    }
}