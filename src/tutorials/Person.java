package tutorials;

public class Person {
	String name; //this is instance variable. This will be different for each object that will be created.
	int age;//this is instance variable.
	static String homeTown; //this  static variable is part of Class itself and not part of instantiated object.
	
	//since this method is public, it is part of the instance
	public Person(){
		System.out.println("Person created without constructor");
	}
	
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

	public Person(String name){
		System.out.println("Person created with constructor");
		this.name = name;
	}

	public void sayHelloTo(Person bob) {
		// TODO Auto-generated method stub
		System.out.println(this.name+ " said Hello to "+bob.getName());
		
	}
}
