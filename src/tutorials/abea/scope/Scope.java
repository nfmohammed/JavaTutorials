package tutorials.abea.scope;

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
		//value of x will be changed
		x = 10;
		
	}
	
	static void doSomethingLocally(){
		//y is local to this method
		int y = 100;
	}
}
