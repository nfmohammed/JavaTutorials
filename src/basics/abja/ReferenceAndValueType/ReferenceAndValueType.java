package basics.abja.ReferenceAndValueType;

import basics.abba.classes_objects.Person;

//https://www.youtube.com/watch?v=eRfvgSvf-mM&list=PL09CE2067DE105C40&index=10
public class ReferenceAndValueType {
	
	public static void main(String[] args) {
		//All primitives in Java are Value Type
		//byte, short, int, long, float, double, boolean, char
		
		//When we pass primitive type variable, we actually pass value and not the reference or address of variable.
		int x = 5;
		addOneTo(x);
		System.out.println(x);
		
		Person john = new Person("John Tyson");
		john.setAge(20);
		celebarteBirthday(john);
		System.out.println(john.getAge());//If it prints 21 then the age has been changed by passing john reference
	}
	
	
	
	//we manipulate the copy of value passed
	static void addOneTo(int number){
		number = number+1;
	}
	
	//we manipuate the actual object
	private static void celebarteBirthday(Person person) {
		// TODO Auto-generated method stub
		person.setAge(person.getAge()+1);
		
	}

}
