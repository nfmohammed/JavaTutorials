package basics.java23.interfaces;

/**
 * Created by nmohammed on 2/24/17.
 */
public class AnimalTest {
  public static void main(String[] args) {
    Mammal m = new Mammal();
    m.eat();
    m.move();
    m.noOfLegs();

    Animal a = new Mammal();
    a.eat();
    a.move();
    //a.noOfLegs(); //This method is not accessible since the object type is Animal.
  }

}
