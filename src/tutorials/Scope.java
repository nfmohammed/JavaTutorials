package tutorials;

public class Scope {
	
	//since x is declared outside of any method, it is in scope to all methods.
	static int x;//declaring x
	
	public static void main(String[] args) {
		x = 5;//assigning value to x
		System.out.println(x);
		doSomething();
		System.out.println(x);
		int y = 11;
		doSomethingLocally();
		System.out.println(y);
	}

	
	static void doSomething(){
		x = 10;
		
	}
	
	static void doSomethingLocally(){
		int y = 100;
	}
}
