package tutorials;

public class Arrays {
	
	public static void main(String[] args) {
		int[] myArray; //this creates an array.
		myArray = new int[4]; //create array of size 4
		
		myArray[0] = 5;
		myArray[1] = 3;
		myArray[2] = 0;
		myArray[3] = 1;
		
		System.out.println("The following is the myArray value");
		System.out.println(myArray);//this prints out the array location or array reference
		
		for(int i=0;i<myArray.length;i++){
			System.out.print(myArray[i]+" ");
		}
		
		System.out.println();
		
		//The following for loop is to iterate over a collection and Array is one of the collection
		for(int number:myArray){
			System.out.print(number+" ");
		}
		
		int[] secondArray = new int[]{1,2,3,4,5,6,7,8,9,10};
		
		System.out.println();
		for(int number:secondArray){
			System.out.print(number+" ");
		}
	}
	
}
