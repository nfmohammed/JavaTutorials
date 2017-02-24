package tutorials.aab.arrays;
import java.util.Arrays;

//Second method of sorting two arrays of different size is two start from the right most side of Array a and iterate backward.
//After completing Array A, start from right most of B and iterate backward.
/*Give 2 arrays of size 7 and 3 which are sorted such that the last 3 blocks in first array are empty, merge the arrays in a sorted manner in the most efficient way.
E.g:-
a[7] = [4, 10, 11, 20__, __, __]
b[3] = [1,3,7]*/
public class SortTwoArrays2 {
	
	public static void main(String[] args){
	int[] a = new int[7];
	a[0] = 4;a[1]=10;a[2]=11;a[3]=20;
	int[] b = new int[3];
	b[0]=1;b[1]=3;b[2]=7;
	int alen = a.length;
	int blen = b.length;
	
	int kpointer = 6;
	int apointer = 3;
	int bpointer = 2;
	
	for (apointer=3;apointer>=0;apointer--){
		
		for (bpointer = 2; bpointer>=0; bpointer--){
			
			if (a[apointer] > b[bpointer]){
				a[kpointer] = a[apointer];
				
			}
			else{
				a[kpointer] = b[bpointer];
				b[bpointer] = a[apointer];
			}
			
		}
		kpointer--;
		System.out.println("Value of K =" + kpointer);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b) + "\n");
	}
	
	
	}
}
