package basics.aab.arrays;

public class Arrays {
	
	public static void main(String[] args) {
		int[] myArray; //this creates an array.
		myArray = new int[4]; //create array of size 4
		
		myArray[0] = 5;
		myArray[1] = 3;
		myArray[2] = 0;
		myArray[3] = 1;
		
		System.out.println(myArray);//this prints out the array location or array reference

		//printing array using for-loop
		for(int i=0;i<myArray.length;i++){
			System.out.print(myArray[i]+" ");
		}
		System.out.println();
		
		//printing array using collection
		for(int number:myArray){
			System.out.print(number+" ");
		}
		System.out.println();

		//another way of initializing arrays
		int[] secondArray = new int[]{1,2,3,4,5,6,7,8,9,10};
		for(int number:secondArray){
			System.out.print(number+" ");
		}
		System.out.println();
	}
	
}
