package tutorials.abg.abstract_class;

import tutorials.abg.abstract_class.AbstractClass;

//This is a subclass of Parent:AbstractClass
public class SubClass1 extends AbstractClass {

	@Override //If this method is removed then this program gives error
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Implementation of SubClass1 draw method");
		
	}

}
