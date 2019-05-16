package basics.java03.finalAsConstants;

//We don't have constant type in java, the closes structure type we have is Final.
public class Constants {
	
	public static final int WIDTH = 800; //declare constant value
	public static final int HEIGHT = 600; //declare contant value
	public static final String NAME_OF_GAME = "Need For Speed"; //when contant has multiple words, then separate by underscore
	//With public, these contants can be accessed from anywhere in the program.
	//With static these contants are present with Class itself and not with instantiated objects.
	//final keyword converts a variable into contant field.
	//Once assigned a value, it cannot be changed. 

	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Constants.WIDTH);
		System.out.println(HEIGHT);

		//Declaring final object
		final Person john = new Person("Jonathan", 30);
		//variable "john" is created inside Stack.
		//New object Person created inside Heap and reference stored inside john variable.
		// Since john is final, the reference value inside stack cannot be change 
		//but the data inside Person object (inside heap) can actually change.
		
		//john = new Person("Gary", 31); //uncomment to see error.
		john.setAge(31); //changing value inside heap object
		john.setName("Jimmy"); //changing reference to string object inside heap
	}
}

class Person {
	private String name;
	private int age;
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
}