package interview.expedia;

public class EasyPairSums {

    public static void main(String[] args) {

        int[] a1 = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printPairSum(a1, 11);
        
    }

    private static void printPairSum(int[] arr, int sum) {

        int startIndex = 0;
        int endIndex = arr.length - 1;
        while (startIndex < endIndex) {
            if (arr[startIndex] + arr[endIndex] == sum) {
                System.out.println("Pair = " + arr[startIndex] + ", " + arr[endIndex]);
                startIndex++;
            }
            if(arr[startIndex] + arr[endIndex] > sum) {
                endIndex--;
            }
            if(arr[startIndex] + arr[endIndex] < sum) {
                startIndex++;
            }
        }
    } 
}