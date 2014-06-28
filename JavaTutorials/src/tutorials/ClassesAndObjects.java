package tutorials;

public class ClassesAndObjects {
	
	//since this is static method, this will be part of Class and not part of instantiated object
	public static void main(String[] args) {
		
		Person john = new Person();
		Person bob = new Person();
		
		john.name = "John Carlos";
		john.age = 20;
		john.homeTown = "Chicago";
		
		bob.name = "Bob Janish";
		bob.age = 25;
		bob.homeTown = "Detroit";
		
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
		//The good practise to use Class fields to thru getters and setters
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
