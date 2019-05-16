package basics.java20.inheritance_super_2;

/**
 * Created by nmohammed on 2/24/17.
 */
public class SuperClass {
  int age;
  int height;

  SuperClass(int age) {
    this.age = age;
  }
  SuperClass(int age, int height){
    this.age = age;
    this.height = height;
  }

  public void getAge() {
    System.out.println("The value of the variable named age in super class is: " +age);
  }

  public void getAgeHeight(){
    System.out.println("Age and Height is : " +age + ", " + height);
  }
}
