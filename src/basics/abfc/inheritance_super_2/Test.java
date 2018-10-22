package basics.abfc.inheritance_super_2;

/**
 * Created by nmohammed on 2/24/17.
 */
public class Test {

  public static void main(String argd[]) {

    //When new sub-class is instantiated, the super-class is also instantiated by invoking specify constructor
    SubClass s = new SubClass(24);
    s.getAge();

    SubClass s2 = new SubClass(24,7);
    s2.getAgeHeight();
  }
}
