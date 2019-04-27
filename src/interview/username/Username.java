package interview.username;

import java.util.*;

public class Username{
    public static void main(String[] args) {        
        List<String> test1 = new ArrayList<>();
        test1.add("4"); 
        test1.add("john"); 
        test1.add("adam");
        test1.add("john");
        test1.add("john");
        test1.add("john");
        System.out.println(createUsername(test1));

    }

    private static List<String> createUsername(List<String> u) {
        Map<String, Integer> nextNameAndCount = new HashMap<>();
        ArrayList<String> usernames = new ArrayList<String>(); 
        for(String s : u) {
            s = s.trim();
            if(getNumericValue(s) != null) {
               //ignore the value 
            } else if(!usernames.contains(s)) {
                usernames.add(s);
                nextNameAndCount.put(s, 1);
            } else {
                usernames.add(s + nextNameAndCount.get(s));
                nextNameAndCount.put(s, nextNameAndCount.get(s) + 1);
            }
        }
        return usernames;   
    }

    private static Integer getNumericValue(String s) {
        try {
            return new Integer(Integer.parseInt(s));
        }catch (NumberFormatException nfe) {
            return null;
        }
    }
}