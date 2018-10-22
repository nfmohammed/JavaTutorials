package basics.abha.interfaces;

/**
 * Created by nmohammed on 2/24/17.
 */
public class Mammal implements Animal {

  @Override
  public void eat() {
    System.out.println("Mammal eating");
  }

  @Override
  public void move() {
    System.out.println("Mammal moving");
  }

  public void noOfLegs(){
    System.out.println("Mammal has 4 limbs");
  }
}
