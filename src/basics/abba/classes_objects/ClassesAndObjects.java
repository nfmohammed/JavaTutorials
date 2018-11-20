package basics.abba.classes_objects;

public class ClassesAndObjects {
	
	//since this is static method, this will be part of Class and not part of instantiated object
	public static void main(String[] args) {
		
		Person john = new Person(); //creating "john" object from Person class
		Person bob = new Person(); //creating "bob" object from Person class
		
		john.name = "John Carlos"; //setting john's name without setName method
		john.age = 20; //setting john's age without setAge method
		john.homeTown = "Chicago"; //since homeTown is static, it will be changed at Class level
		
		bob.name = "Bob Janish";
		bob.age = 25;
		bob.homeTown = "Detroit"; //since homeTown is static, Detroit will overwrite Chicago at class level.
		
		System.out.println(john.name+" is "+john.age+" years old"+" and lives in "+john.homeTown);
		System.out.println(bob.name+"is " + bob.age + " years old" + " and lives in "+bob.homeTown);
		System.out.println();
		
		//Defining constructor
		Person mike = new Person("Mike Johnson");
		mike.age = 30;
		mike.homeTown = "Pennsylvania";
		System.out.println(mike.name+" is "+mike.age+" years old"+" and lives in "+mike.homeTown);
		System.out.println();
		
		
		//Defining Getters and Setters
		//The good practise to use Class fields thru getters and setters
		//Go to Source > Generate Getters and Setters
		
		Person shashi = new Person();
		shashi.setName("Shashi Kumar");
		shashi.setAge(18);
		System.out.println(shashi.getName()+" is "+shashi.getAge()+" years old "+" and lives in "+shashi.homeTown);
		System.out.println();
	
		//new method can be created here and eclipse will ask us to create its implementation in Person Class file
		john.sayHelloTo(bob);
		bob.sayHelloTo(john);
	}
}
