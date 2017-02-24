package tutorials;

public abstract class AbstractClass {
	
	public abstract void draw(); //Any class which extends this class, must implement draw method.
	
	public static void main(String[] args) {
		
		//Abstract class cannot be instantiated. 
		//The use of abstract class is, we can define some method which an extending class must implement
		//AbstractClass abc = new AbstractClass();
		SubClass1 sc1 = new SubClass1();
		SubClass2 sc2 = new SubClass2();
		
		sc1.draw();
		sc2.draw();
		
		
		//Now we will define new subclass but give the object type as that of extended Class
		System.out.println();
		System.out.println("Declaring object type as extended type......");
		AbstractClass sc3 = new SubClass1();
		AbstractClass sc4 = new SubClass2();
		
		AbstractClass[] abstractArray = new AbstractClass[2];
		abstractArray[0] = sc3;
		abstractArray[1] = sc4;
		
		for(AbstractClass ab: abstractArray){
			ab.draw();
		}
		
		
	}
}
