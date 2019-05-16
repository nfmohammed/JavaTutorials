package basics.java21.inheritance.overriding;

class AnimalC {
  public void move() {
    System.out.println("Animals can move");
  }
}

class DogC extends AnimalC {
  public void move() {
    super.move();   // invokes the super class method
    System.out.println("Dogs can walk and run");
  }
}

public class ExampleC {

  public static void main(String args[]) {
    AnimalC b = new DogC();   // Animal reference but Dog object
    b.move();   // runs the method in Dog class
  }
}