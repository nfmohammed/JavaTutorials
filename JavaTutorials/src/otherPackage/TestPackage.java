//https://www.youtube.com/watch?v=l5SviD48vOQ&list=PL09CE2067DE105C40&index=12
package otherPackage;

public class TestPackage {
	
	public static void main(String[] args) {
		
		//In order to access Person class, we have to reference it thru tutorials package
		tutorials.Person p1 = new tutorials.Person("Mike Tyson");
		p1.setAge(33);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
	}

}
