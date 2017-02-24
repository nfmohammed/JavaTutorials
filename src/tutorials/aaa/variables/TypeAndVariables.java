package tutorials.aaa.variables;

public class TypeAndVariables {

	//static means that this method is associated with Class and not with Object.
	public static void main(String[] args) {
		
		int myVariable; //declaring a variable called myVariable that stores the type int
		myVariable = 5;//we are initializing myVariable to value 5
		
		int myVariable2 = 10; //here we are declaring a variable and also initializing
		
		double x = 2.5; 
		
		String hello = "Hello, ";
		String name = "Charlie";
		System.out.println(hello+name);//string concatenation

		// final means the value is not going to change once initialized
		// if you try to change, the compiler will give error
		final double pi = 3.14159;

	}

}
