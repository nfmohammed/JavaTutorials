package interview.expedia;

public class EasyPivotSearch{

    public static void main(String[] args) {
        int[] a1 = new int[]{4, 5, 6, 7, 0, 1, 2};
        int[] a2 = new int[]{0, 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(findPivotIndex(a1)); //outputs: 4
        System.out.println(findPivotIndex(a2)); //outputs: -1

        //Now that we know how to find PivotIndex, let's write code to find target index using binary search
        int[] a3 = new int[]{11, 12, 13, 14, 15, 16, 17, 18, 19};
        System.out.println(binarySearch(a3, 19)); //output: 8

        //Finding Target Index for Rotated Array
        System.out.println("Result Index = " + findTargetIndexInRotatedArray(a1, 1)); //output 5

        //Finding Target Index in Non Rotated Array
        System.out.println("Result Index = " + findTargetIndexInRotatedArray(a3, 13)); //output 2

    }

    //Index of an array where LeftElement is Greater than current element.
    private static int findPivotIndex(int[] arr) {
        int prev = arr[0];
        for(int i=1; i < arr.length; i++) {
            if( arr[i] < prev) {
                return i;
            }
            prev = arr[i];
        }
        return -1;
    }

    //Return index of the element
    private static int binarySearch(int[] arr, int target) {
        int targetIndex = arr.length / 2;
        if (arr[targetIndex] == target) {
            return targetIndex;
        }
        while (arr[targetIndex] != target) {
            if (target < arr[targetIndex]) {
                targetIndex = targetIndex / 2;
            }
            if (target > arr[targetIndex]) {
                targetIndex = targetIndex + (arr.length - targetIndex)/2 ; 
            }
            if (target == arr[targetIndex]){
                return targetIndex;
            }
            if (targetIndex == 0 || targetIndex >= arr.length -1) {
                return -1;
            }
        }
        return -1;
    }

    private static int findTargetIndexInRotatedArray(int[] fullArray, int target) {
        printMessage(fullArray, target);

        int pivotIndex = findPivotIndex(fullArray);
        
        //If array is not rotated then do the normal binary search
        if (pivotIndex == -1) return binarySearch(fullArray, target);

        if(fullArray[pivotIndex] == target) return pivotIndex;

        if(fullArray[0] < target && fullArray[pivotIndex-1] > target) {
            return binarySearch(subArray(fullArray, 0, pivotIndex-1), target);
        }
        if (fullArray[pivotIndex] <= target) {
            return pivotIndex + binarySearch(subArray(fullArray, pivotIndex, fullArray.length), target);
        }
        return -1;

    }

    private static int[] subArray(int[] fullArray, int startIndex, int endIndex) {
        int[] subArray = new int[endIndex - startIndex + 1];
        for (int i = 0; startIndex <= endIndex && startIndex < fullArray.length; i++ ) {
            subArray[i] = fullArray[startIndex];
            startIndex ++;
        }
        return subArray;
    }
    private static void printMessage(int[] arr, int target) {
        System.out.println("Finding value: " + target + " in followign array");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}