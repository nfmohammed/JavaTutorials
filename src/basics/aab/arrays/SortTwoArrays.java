package basics.aab.arrays;
import java.util.Arrays;

/*Give 2 arrays of size 7 and 3 which are sorted such that the last 3 blocks in first array are empty, merge the arrays in a sorted manner in the most efficient way.
E.g:-
a[7] = [4, 10, 11, 20, __, __, __]
b[3] = [1,3,7]*/

//Solution: We will use the last box in array A as the intermediate swapping box.
//We will check each element of array A against all elements of array B
//If element of B is smaller than element A then we swap them.
public class SortTwoArrays {

	public static void main(String[] args){
		int[] a = {4, 10, 11, 20, 0, 0, 0};
		int[] b = {1, 3, 7};
		int alen = a.length;
		int blen = b.length;
		int i, j;
		for(i=0; i<alen; i++){
			
			for(j=0;j<blen;j++){
				//this will swap element of A and B
				if (b[j]<a[i]){
					a[alen-1] = a[i];
					a[i] = b[j];
					b[j] = a[alen-1];
				}
				
				//this will sort B elements in ascending order
				//again we will use the last box of a as the swapping assistant.				
			}
		
		}
		System.out.println(Arrays.toString(a));
		

		for(int k=1;k<=2;k++){
			if (b[1] < b[0]){
				a[alen-1] = b[1];
				b[1] = b[0];
				b[0] = a[alen-1];
				
			}
			if(b[2] < b[1]){
				a[alen-1] = b[2];
				b[2] = b[1];
				b[1] = a[alen-1];
			}
			
		}
		System.out.println(Arrays.toString(b));	
		
		a[4] = b[0];
		a[5] = b[1];
		a[6] = b[2];
		
		System.out.println(Arrays.toString(a));
			
	}
}

