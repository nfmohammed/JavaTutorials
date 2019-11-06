package interview.expedia;

public class EasyBalancedSum {

    public static void main(String[] args) {
        int[] a1 = new int[]{ -7, 1, 5, 2, -4, 3, 0}; //Balanced Index 3 and 6
        int[] a2 = new int[] { 1, 2, 5, 0, 3 }; //Balanced Index = 2

        bruteForceSolution(a1); //Balanced Index 3 and 6
        bruteForceSolution(a2); //Balanced Index = 2

        System.out.println("-------------");
        preferredSolution(a1);
        preferredSolution(a2);
    }

    private static void bruteForceSolution(int[] arr) {

        int leftSum, rightSum;
        //iterate thru all elements of an array
        for(int i = 0; i < arr.length; ++i) {
            
            leftSum = 0;
            rightSum = 0;
            //iterate left 
            for(int j =0; j < i; j++) {
                leftSum = leftSum + arr[j];
            }

            //iterate right
            for(int j=i+1; j<arr.length; j++) {
                rightSum = rightSum + arr[j];
            }

            if (leftSum == rightSum) {
                System.out.println("Balanced Index = " + i);
            }  
        }
    }

    private static void preferredSolution(int[] arr) {
        int sum = 0;
        
        //calculate sum of array in first iteration
        for (int i=0; i < arr.length; i++) {
            sum += arr[i];
        }
        final int SUM_OF_ARRAY = sum;

        //second iteration to compare LeftSum and RightSum
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < arr.length ; i++) {
            if( i != 0 ) {
                leftSum += arr[i-1];
            }
            rightSum = SUM_OF_ARRAY - leftSum - arr[i];
            if (leftSum == rightSum) {
                System.out.println("Preferred Balanced Index = " + i);
            }
        }

    }


    
}