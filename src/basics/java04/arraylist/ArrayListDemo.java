package basics.java04.arraylist;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class ArrayListDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] string1 = {"HIE","Dogiie","Rock"};
		String[] string2 = {"Blackboard","Testing"};
		ArrayList<String> m = mergeString(string1,string2);
		System.out.println(m);

		//converting arrays into arraylist
		String[] colors = {"red", "blue", "green"};
		List<String> colorsList = Arrays.asList(colors);
		System.out.println(colorsList);
 		
	}

	public static ArrayList<String> mergeString(String[] s1, String[] s2){
		ArrayList<String> myList = new ArrayList<String>();
		for(String s:s1) myList.add(s);
		for(String s:s2) myList.add(s);
		return myList;
	}

}
