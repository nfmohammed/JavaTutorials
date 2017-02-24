package tutorials.abg.abstract_class;

import tutorials.abg.abstract_class.AbstractClass;

public class SubClass2 extends AbstractClass {

	@Override //If this method is removed then this class gives error
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Implementation of SubClass2 draw method");
		
	}

}
