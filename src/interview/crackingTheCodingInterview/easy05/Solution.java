package interview.crackingTheCodingInterview.easy05;

import java.awt.Point; 
import java.util.ArrayList;
import java.util.List; 

public class Solution {

    public static void main(String[] args) {
        int[][] mxn = {
          {1,1,1,1,1},
          {1,1,1,1,1},
          {1,1,1,1,1},
          {1,1,1,1,0},
        };
        printMatrix(mxn);
        System.out.println();
        int[][] MXN = mxn;
        List<Point> pList = findZeroLocation(mxn);
        for(Point p: pList) {
            MXN = changeMatrix((int)p.getX(), (int)p.getY(), MXN);
        }
        
        printMatrix(MXN);

    }
    private static List<Point> findZeroLocation(int[][] mxn) {
        List<Point> indexes = new ArrayList<Point>();
        int row = mxn.length;
        for(int i=0; i < row; i++) {
            int col = mxn[i].length;
            for(int j=0; j < col; j++) {
                if (mxn[i][j] == 0) {
                    // mxn = changeMatrix(i, j, mxn);
                    indexes.add(new Point(i, j));
                }
            }
        }
        return indexes;
    }
    private static int[][] changeMatrix(int x, int y, int[][] mxn) {
        int rowx = mxn.length; //number of rows
        int colx = mxn[x].length; //number of columns in a row
        for(int j = 0; j < colx; j++) {
            mxn[x][j] = 0;
        }
        for(int i=0; i < rowx; i++) {
            mxn[i][y] = 0;
        }
        return mxn;
    }
    private static void printMatrix(int[][] mxn) {
        int row = mxn.length;
        for(int i = 0; i < row; i++) {
            System.out.println();
            int col = mxn[i].length;
            for(int j=0; j < col; j++) {
                System.out.print(mxn[i][j]);
                if(j != col-1) System.out.print(",");
            }
        } 
    }
}
