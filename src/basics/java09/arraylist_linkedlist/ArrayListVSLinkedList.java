/*	ArrayList VS LinkedList
 * We use arraylist when we need to add items at the end of the list.
 * We use linkedList when we need to add items anywhere in the list.
 
 * In ArrayList, items are stored in sequential index [0][1][2][3][4]....
 * In LinkedList, items have reference to the next item(and previous if it is doubly linked list)
 * eg: [0] -> [1] -> [2]
 *
 * Searching arrayList is easier when we know the index.
 * Searching ListList is time consuming.
 */

package basics.java09.arraylist_linkedlist;

import java.util.*;

public class ArrayListVSLinkedList {
	
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		addToEndOfList("ArrayList",arrayList);
		addToEndOfList("LinkedList",linkedList);
		System.out.println();
		addToFrontOfList("ArrayList",arrayList);
		addToFrontOfList("LinkedList",linkedList);
	}
	
	private static void addToFrontOfList(String s,
			List<Integer> list) {
		long start = System.currentTimeMillis();
		for(int i=0;i<1E5;i++){
			list.add(0, i);
		}
		long end = System.currentTimeMillis();
		
		String time = end - start + " ";
		System.out.println("Time taken to add in front of list = "+time+" milliseconds for "+s+" creation");
		
	}

	private static void addToEndOfList(String s, List<Integer> list){
		long start = System.currentTimeMillis();
		for(int i=0;i<1E5;i++){
			list.add(i);
		}
		
		long end = System.currentTimeMillis();
		String time  = (end -start)+" ";
		System.out.println("Time taken to add to the end of list = "+time+" milliseconds for "+s+" creation");
		
	}
	
	
	

}
