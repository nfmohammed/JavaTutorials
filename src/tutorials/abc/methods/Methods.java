package tutorials.abc.methods;

import tutorials.abb.classes_objects.Person;

public class Methods {

	//this static method is associated with Class and not with instantiated Object.
	public static void main(String[] args) {
		
		sayHelloWorld();
		sayHelloTo("Charlie");
		sayHelloTo("John");
		System.out.println(returnFive());
		System.out.println(square(10));

		Person p = new Person("John Doe");
		p.sayHelloTo(p); //invoking method on an object
		
	}
	
	//Method
	static void sayHelloWorld(){
		System.out.println("Hello World");
	}
	
	//Method with input parameter
	static void sayHelloTo(String name){
		System.out.println("Hello, "+name);
	}
	
	//Method with return type
	static int returnFive(){
		return 5;
	}
	
	//Method takes input and return value
	static int square(int x){
		return x*x; 
	}
	
}
