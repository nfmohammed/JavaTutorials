package tutorials;

public class Methods {
	public static void main(String[] args) {
		
		sayHelloWorld();
		sayHelloTo("Charlie");
		sayHelloTo("John");
		System.out.println(returnFive());
		System.out.println(square(10));
		
		
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
