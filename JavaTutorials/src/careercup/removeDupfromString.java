package careercup;

public class removeDupfromString {
	
	public static void main(String[] args) {
		String givenString = "aaabbbaaabbb";
		
		char[] givenCharArray;
		
		char[] expectedString;
		
		givenCharArray = givenString.toCharArray();
		expectedString = removeDuplicate(givenCharArray);
		System.out.println(expectedString);
	}

	private static char[] removeDuplicate(char[] str) {
		// TODO Auto-generated method stub
		System.out.println(str);
		int newLength = str.length;
		int cursor;
		int i, j;
		if (str.length ==1) return str;
		for(i=0;i<=newLength-2;i++){
			for(j=i+1;j<=newLength-1;){
				if(str[i] != str[j]){
					//only when the characters don't match then increment j
					j++;
				}else{
					cursor = j;
					while(cursor <newLength-1){
						str[cursor] = str[cursor+1];
						cursor++;
					}
					str[cursor] = '\0';//store null in char array
					newLength = newLength-1;
				}
			}
			
		}
		//System.out.println(str);
		return str;
	}
}
