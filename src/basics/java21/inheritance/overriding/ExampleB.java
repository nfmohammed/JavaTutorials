package basics.java21.inheritance.overriding;


class AnimalB {
  public void move() {
    System.out.println("Animals can move");
  }
}

class DogB extends AnimalB {
  public void move() {
    System.out.println("Dogs can walk and run");
  }
  public void bark() {
    System.out.println("Dogs can bark");
  }
}

public class ExampleB {

  public static void main(String args[]) {
    AnimalB a = new AnimalB();   // Animal reference and object
    AnimalB b = new DogB();   // Animal reference but Dog object

    a.move();   // runs the method in Animal class
    b.move();   // runs the method in Dog class
    //b.bark();  //compile error since b's reference type Animal does not have "bark" method
  }
}
