//Given a number in an array form, Come up with an algorithm to push all the zeros to the end. 
//Solution: We will create a new array with same length and 
//we will start storing index of non-zero numbers from left of this new array
//and all zero numbers from right of this array
package careercup;

public class PushZerosToRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] givenNumber = new int[]{0,0,0,0,0,0,1};
		
		int size = givenNumber.length;
		int[] expectedArray = new int[size];
		int left = -1;
		int right = size;
		for(int i=0;i<size;i++){
			if(givenNumber[i]!=0){
				left++;
				expectedArray[left] = givenNumber[i];
				System.out.println("Left = "+left);
			}else{
				right--;
				expectedArray[right]=givenNumber[i];
				System.out.println("Right = "+right);
			}
		}
		
		for(int i=0;i<size;i++){
			System.out.print(expectedArray[i]+" ");
		}

	}

}
