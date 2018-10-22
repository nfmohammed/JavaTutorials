package basics.abfb.inheritance_super;

public class Child extends Parent {
  int num = 10;

  // display method of sub class
  public void display() {
    System.out.println("This is the display method of subclass");
  }

  public void my_method() {
    // Instantiating subclass
    Child c = new Child();

    // Invoking the display() method of sub class
    c.display();

    // Invoking the display() method of superclass
    super.display();

    // printing the value of variable num of subclass
    System.out.println("value of the variable named num in sub class:"+ c.num);

    // printing the value of variable num of superclass
    System.out.println("value of the variable named num in super class:"+ super.num);
  }
}