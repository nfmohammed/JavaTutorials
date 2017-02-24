package tutorials;

public class TypeAndVariables {
	
	public static void main(String[] args) {
		
		int myVariable; //declaring a variable called myVariable that stores the type int
		myVariable = 5;//we are initializing myVariable to value 5
		
		int myVariable2 = 10; //here we are declaring a variable and also initializing
		
		double x = 2.5; 
		
		String hello = "Hello, ";
		String name = "Charlie";
		
		
		System.out.println(myVariable);
		
		myVariable = 10;
		System.out.println(myVariable);
		
		myVariable = myVariable + 1;
		System.out.println(myVariable);
		
		System.out.println(hello+name);//string concatenation
	}

}
