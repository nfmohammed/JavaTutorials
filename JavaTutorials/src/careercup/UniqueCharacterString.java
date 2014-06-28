package careercup;


import java.util.ArrayList;
import java.util.HashSet;


public class UniqueCharacterString {

	public boolean isStringUnique(String str){
		HashSet<Character> mySet = new HashSet<Character>();
		int i;
		for (i=0;i<str.length();i++){
			mySet.add(str.charAt(i));
			//System.out.println(mySet);
		}
		
		if (str.length()==mySet.size())
			return true;
		else
			return false;
				
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqueCharacterString ucs = new UniqueCharacterString();
		ArrayList<String> testString  =new ArrayList<String>();
		testString.add("ABCD");
		testString.add("AB CD ");
		testString.add("XYZ123");
		testString.add("ABCDA");
		testString.add("11890");
		testString.add("AAAAA");
		testString.add("!@#$%^");
		testString.add("!@#$**");
		//testString.add("");
		System.out.println(testString);
		
		for(String str:testString){
			if (ucs.isStringUnique(str)){
				System.out.println("\""+str+"\""+ " has uniquie characters");
			}else{
				System.out.println("\""+str+"\""+ " does not have unique characters");
			}
		}

	}
	

	

}
