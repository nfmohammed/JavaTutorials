package basics.abda.access_modifiers;

public class AccessModifiers {
	//private is most restrictive
	//default
	//protected
	//public
	
	//Access Modifiers is also applicable for variables
	public int x;
	private int y;
	
	public static void main(String[] args) {
		
	}
	
	//this method can be called accessed from anywhere in the program
	//as long as you have an instance of this class to call it from
	public static void doSomethingPublic(){
		
		
	}
	
	//this method means that this method can't be accessed anywhere other than inside this class
	private static void doSomethingPrivate(){
		
	}
	
	//this method can be accessed inside of this package
	//and from subclasses of this class
	protected static void doSomethingProtected(){
		
	}
	
	//this method can only be accessed from inside of this package
	void doSomethingDefault(){
		
	}

}
