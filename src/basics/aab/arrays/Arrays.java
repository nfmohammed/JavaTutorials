package basics.aab.arrays;

public class Arrays {
	
	public static void main(String[] args) {
		exampleOfPrimitiveArray();
		exampleOfObjectArray();
	 }
	 
	 public static void exampleOfPrimitiveArray() {
		//http://web.cerritos.edu/pnguyen/SitePages/cis103/java_arrays.htm
		//Creating an empty array does not set aside memory in heap.
		//myArray reference is created in stack 
		int[] myArray;

		//New Array Object of size 4 is created that can hold 4 references
		//myArray reference in stack is pointed to the array object in heap	
		//Since it is primitive type, the array will hold 4 values and not 4 object references
		//For int, the default values stored is 0
		myArray = new int[4]; //create array of size 4 and initialize values to 0
		//Once the array is created, it's size cannot be changed. 
		
		myArray[0] = 5; // value overwritten from 0 to 5
		myArray[1] = 3; // value overwritten from 0 to 3
		myArray[2] = 0; // value overwritten from 0 to 0
		myArray[3] = 1; // value overwritten from 0 to 1
		System.out.println(myArray);//this prints out the array location in heap
		System.out.println(myArray.length); //output is 4
		//Array object in heap has a property "length"

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

		//Second way of initializing arrays
		int[] secondArray = new int[]{1,2,3,4,5,6,7,8,9,10};
		for(int number:secondArray){
			System.out.print(number+" ");
		}
		System.out.println();

		//Third way of initializing arrays
		double[] scores = {10, 20, 30, 40, 50};
		for (double d: scores) {
			System.out.print(d+" ");
		}
		System.out.println();

		//Declaring empty array
		int[] emptyArray = {};
		System.out.println("Default size of empty array is " + emptyArray.length); //output is 0
	 }

	 public static void exampleOfObjectArray() {
		System.out.println("Examples Of Object Array");

		//"people" variable is created in stack
		//2 person objects created in heap, let's call those objects James and Jimmey
		//1 new array is created and references of James and Jimmey are stored inside array.
		//The array reference is then stored inside "peope" variable in stack.
		Person[] people = {new Person("James", 19), new Person("Jimmey", 20)};
		for (Person p: people) {
			p.info();
		}

		//The reference to James is replaced with Kimmy.
		//James object is not referenced by any program and it will be garbage collected. 
		people[0] = new Person("Kimmy", 20);

		//The reference to Jimmey is replaced with Kelsey.
		//Jimmey object is not referenced by any program and it will be garbage collected.
		people[1] = new Person("Kelsey", 30);
		for (Person p: people) {
			p.info();
		}
		System.out.println(people.length);
	 }
}

class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void info() {
		System.out.println(this.name + " is "+ this.age);
	}
}


