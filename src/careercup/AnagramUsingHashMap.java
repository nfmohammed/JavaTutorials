package careercup;

import java.util.HashMap;

/*The following program checks to see if two strings are anagram or not
Examples of anagram are
Mother-in-law = Hitler woman
Dormitory = Dirty Room
Astronomer = Moon starrer
Punishments = Nine Thumps
School master = The classroom
*/
public class AnagramUsingHashMap {
	
	public static void main(String[] args) {
		String s1 = "abcdabcd";
		String s2 = "dabccbad";
		if (areAnagram(s1,s2)){
			System.out.println(s1+" is ANAGRAM of "+s2);
		}else{
			System.out.println(s1+" is NOT ANAGRAM of " + s2);
		}
		
		s1 = "Dormitory";
		s2 = "DirtyRoom";
		if (areAnagram(s1,s2)){
			System.out.println(s1+" is ANAGRAM of "+s2);
		}else{
			System.out.println(s1+" is NOT ANAGRAM of " + s2);
		}
		
		s1 = "Mother In Law";
		s2 = "Hitler Women";
		if (areAnagram(s1,s2)){
			System.out.println(s1+" is ANAGRAM of "+s2);
		}else{
			System.out.println(s1+" is NOT ANAGRAM of " + s2);
		}
		
		s1 = "School Master";
		s2 = "The Classroom";
		if (areAnagram(s1,s2)){
			System.out.println(s1+" is ANAGRAM of "+s2);
		}else{
			System.out.println(s1+" is NOT ANAGRAM of " + s2);
		}
			
		
	}

	public static boolean areAnagram(String s1, String s2) {
		// TODO Auto-generated method stub
		//return false;
		s1 = s1.toUpperCase(); //Capitalize because smaller letter and Cap letters are different.
		s2 = s2.toUpperCase();
		s1 = s1.trim(); //Trim so that space is not counted as character
		s2 = s1.trim();
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		HashMap<Character,Integer> h1 = new HashMap<Character,Integer>();
		HashMap<Character,Integer> h2 = new HashMap<Character,Integer>();
		
		for(char c:c1){
			if(h1.get(c)==null){
				h1.put(c, 1);
			}else{
			h1.put(c, h1.get(c)+1);
			}
		}
		System.out.println( s1+ " = "+h1);
		
		for(char c:c2){
			 if(h2.get(c)==null){
				h2.put(c, 1);
			}else{
				h2.put(c, h2.get(c)+1);
			}
		}
		
		System.out.println(s2+" = "+h2);
		return h1.equals(h2);
		
	}

}
