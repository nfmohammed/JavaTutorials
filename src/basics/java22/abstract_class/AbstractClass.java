package basics.java22.abstract_class;

//Abstract class cannot be instantiated.
//The use of abstract class is, we can define some method which an extending class must implement
//Abstract class can also contain common properties which sub-class can access.
public abstract class AbstractClass {

	final String COMPANY="expedia";

	public void getCompany(){
		System.out.println(COMPANY);
	}
	public abstract void draw(); //Any class which extends this class, must implement draw method.

}
