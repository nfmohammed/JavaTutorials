package interview.crackingTheCodingInterview.medium03;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);list.add(5);list.add(8);list.add(5);list.add(10);list.add(2);list.add(1);
        printList(list);
        List<Integer> updatedList = partitionedList(list, 5);
        printList(updatedList);
        
    }
    private static List<Integer> partitionedList(List<Integer> list, Integer x) {
        LinkedList<Integer> updatedList = new LinkedList<>();
        for(int i = 0;  i <= list.size()-1; i++) {
            Integer num = list.get(i);
            if ( num < x ) {
                updatedList.add(0, num);
            } else {
                updatedList.add(num);
            }
        }
        return updatedList;
    }

    private static void printList(List<Integer> list) {
        for (Integer i: list) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
   