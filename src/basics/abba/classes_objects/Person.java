package basics.abba.classes_objects;

//This is Class: Person
public class Person {

	//properties or field variable or member variable or instance variable
	String name; //this is instance variable. This will be different for each object that will be created.
	int age;//this is instance variable.
	static String homeTown; //static variable is part of Class itself and not part of instantiated object.
	
	//since this method is public, it is part of the instance
	public Person(){
		System.out.println("Person created without constructor");
	}
	public Person(String name){
		System.out.println("Person created with constructor");
		this.name = name;
	}

	//Getters and Setters for instance variables
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



	//methods or functionalities of this class
	public void sayHelloTo(Person bob) {
		// TODO Auto-generated method stub
		System.out.println(this.name+ " said Hello to "+bob.getName());
		
	}
}
