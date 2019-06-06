package interview.crackingTheCodingInterview.medium01;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.awt.Point;

public class Solution {
    public static void main(String[] args) {

        Map<Integer, List<Point>> map = new HashMap<>();
        for (int i = 0; i <=100; i++) {
            for (int j=0; j <=100; j++) {
                int value = i*i*i + j*j*j;
                map.putIfAbsent(value, new ArrayList<Point>());
                map.get(value).add(new Point(i, j));
            }
        }

        for(Map.Entry<Integer, List<Point>> entry : map.entrySet()) {
            //there will be lots of values that satisfies more than 1 criteria
            // if (entry.getValue().size() > 1) {
            if (entry.getValue().size() > 2) {
                for (Point p: entry.getValue()) {
                    System.out.print("("+(int)p.getX()+", "+(int)p.getY()+") ");
                }
                System.out.println();
            }
        }
        
    }
}